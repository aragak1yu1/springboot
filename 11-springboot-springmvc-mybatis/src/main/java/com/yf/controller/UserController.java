package com.yf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yf.pojo.User;
import com.yf.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping("addUser")
	public String addUser(User user){
		userServiceImpl.addUser(user);
		return "ok";
	}
	
	@RequestMapping("showUser")
	public String showUser(Model model){
		model.addAttribute("list", userServiceImpl.showAllUser());
		return "show";
	}
	
	@RequestMapping("showUserById")
	public String showUserById(int id, Model model){
		model.addAttribute("user", userServiceImpl.showUserById(id));
		return "update";
	}
	
	@RequestMapping("editUser")
	public String editUser(User user){
		userServiceImpl.changeUser(user);
		return "redirect:showUser";
	}
	
	@RequestMapping("deleteUser")
	public String editUser(int id){
		userServiceImpl.removeUserById(id);
		return "redirect:/user/showUser";
	}
}
