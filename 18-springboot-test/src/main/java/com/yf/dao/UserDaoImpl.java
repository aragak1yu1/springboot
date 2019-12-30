package com.yf.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl {

	public void saveUser(){
		System.out.println("insert into users");
	}
}
