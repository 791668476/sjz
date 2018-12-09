package com.sjz.shop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjz.shop.pojo.User;
import com.sjz.shop.service.UserService;
import com.sjz.shop.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserService userServiceImpl;

	//注册
	@RequestMapping(value="/register")
	public String regist(User user){
		userServiceImpl.regist(user);
		return "login";
	}
	//判断用户名是否存在
	@RequestMapping(value="/checkUsername")
	public @ResponseBody Map<String,Boolean> checkUsername(String username,Model model){
		boolean isExist = userServiceImpl.checkUsername(username);
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("isExist", isExist);
		return map;
	}
	//登录功能
	@RequestMapping(value="/login")
	public String login(User user,@RequestParam(value="autoLogin",required=false) String autoLogin,HttpServletResponse response,HttpSession session,Model model){
		User login = userServiceImpl.login(user);
		if(login!=null){
			if("autoLogin".equals(autoLogin)){
				Cookie cookie_username = new Cookie("cookie_username", login.getUsername());
				cookie_username.setMaxAge(10*60);
				Cookie cookie_password = new Cookie("cookie_password", login.getPassword());
				cookie_password.setMaxAge(10*60);
				response.addCookie(cookie_username);
				response.addCookie(cookie_password);
			}
			//model.addAttribute("user", login);
			session.setAttribute("user", login);
			return "redirect:/index";
		}else{
			model.addAttribute("loginError", "用户名或密码错误");
			return "login";		
		}
	}
	//退出登录
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		session.removeAttribute("user");
		return "redirect:/index";
	}
	
	@RequestMapping(value="/Autologin")
	public User Autologin(String username,String password){
		return userServiceImpl.Autologin(username, password);
	}
}
