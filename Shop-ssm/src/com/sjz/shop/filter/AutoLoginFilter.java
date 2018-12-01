package com.sjz.shop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.sjz.shop.controller.UserController;
import com.sjz.shop.pojo.User;
import com.sjz.shop.service.UserServiceImpl;

public class AutoLoginFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		User user = (User) req.getSession().getAttribute("user");
		if(user==null){
			String cookie_username=null;
			String cookie_password=null;
			Cookie[] cookies = req.getCookies();
			if(cookies!=null){
				for(Cookie cookie:cookies){
					if(cookie.getName().equals("cookie_username")){
						cookie_username=cookie.getValue();
					}
					if(cookie.getName().equals("cookie_password")){
						cookie_password=cookie.getValue();
					}
				}
			}
			
			if(cookie_username!=null&&cookie_password!=null){
				UserController userController = new UserController();
				user=userController.Autologin(cookie_username, cookie_password);
				req.getSession().setAttribute("user", user);
			}
			
		}
		
		
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
