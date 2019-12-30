package com.yf.mapper;

import java.util.List;

import com.yf.pojo.User;

public interface UserMapper {
	
	void insUser(User user);
	
	List<User> selAll();
	
	User selById(int id);
	
	void updUser(User user);
	
	void delById(int id);
}
