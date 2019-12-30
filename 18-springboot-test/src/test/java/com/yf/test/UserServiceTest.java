package com.yf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yf.App;
import com.yf.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)  // 启动器,让junit与spring进行整合
@SpringBootTest(classes={App.class}) // 1.当前类为springboot测试类 2.加载springboot启动类，启动springboot 
public class UserServiceTest {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Test
	public void testAddUser(){
		this.userServiceImpl.addUser();
	}
}
