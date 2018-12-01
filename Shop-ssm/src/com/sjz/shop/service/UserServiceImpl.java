package com.sjz.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjz.shop.mapper.userDao;
import com.sjz.shop.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	userDao userdao;
	
	@Override
	public void regist(User user) {
		userdao.regist(user);
	}

	@Override
	public boolean checkUsername(String username) {
		int count = userdao.checkUsername(username);
		if(count!=0){
			return true;
		}
		return false;
		
	}

	@Override
	public User login(User user) {
		User login = userdao.login(user);
		return login;
	}
	
	@Override
	public User Autologin(String username,String password){
		 User user = userdao.Autologin(username, password);
		 return user;
	}

}
