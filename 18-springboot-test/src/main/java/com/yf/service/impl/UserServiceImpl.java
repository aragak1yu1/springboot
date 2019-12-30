package com.yf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yf.dao.UserDaoImpl;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public void addUser(){
		userDaoImpl.saveUser();
	}
}
