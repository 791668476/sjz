package com.sjz.shop.service;

import com.sjz.shop.pojo.User;

public interface UserService {
	void regist(User user);
	boolean checkUsername(String username);
	User login(User user);
	User Autologin(String username,String password);
}
