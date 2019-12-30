package com.yf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yf.mapper.UserMapper;
import com.yf.pojo.User;
import com.yf.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addUser(User user) {
		userMapper.insUser(user);
	}
	
	@Override
	public List<User> showAllUser() {
		return userMapper.selAll();
	}
	
	@Override
	public User showUserById(int id) {
		return userMapper.selById(id);
	}
	
	@Override
	public void changeUser(User user) {
		userMapper.updUser(user);
	}
	
	@Override
	public void removeUserById(int id) {
		userMapper.delById(id);
	}
}
