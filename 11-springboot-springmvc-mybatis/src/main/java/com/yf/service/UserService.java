package com.yf.service;

import java.util.List;

import com.yf.pojo.User;

public interface UserService {
	
	void addUser(User user);
	
	List<User> showAllUser();
	
	User showUserById(int id);
	
	void changeUser(User user);
	
	void removeUserById(int id);
}
