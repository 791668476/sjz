package com.sjz.shop.mapper;

import com.sjz.shop.pojo.User;

public interface userDao {
	void regist(User user);
	int checkUsername(String username);
	User login(User user);
	User Autologin(String username,String password);
}
