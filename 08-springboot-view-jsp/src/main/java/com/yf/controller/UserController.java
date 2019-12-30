package com.yf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yf.pojo.User;

/**
 * springboot整合jsp
 * 
 * @author yangf
 *
 */
@Controller
public class UserController {
	
	@RequestMapping("showUser")
	public String showUser(Model model) {
		
		List<User> list = new ArrayList<>();
		list.add(new User(1, "张三", 20));
		list.add(new User(2, "李四", 21));
		list.add(new User(3, "王五", 22));
		model.addAttribute("list", list);
		return "userList";
	}
}
