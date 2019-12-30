package com.yf.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yf.pojo.User;

@Controller
public class UserController {
	/**
	 * 解决异常的方式，注入user对象
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("addUser")
	public String showPage(@ModelAttribute("u") User user){
		return "addUser";
	}
	
	/**
	 * @valid表示开启对user的校验
	 * BindingResult封装了校验的结果
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("save")
	public String saveUser(@ModelAttribute("u") @Valid User user, BindingResult br){

		if(br.hasErrors()){
			
			return "addUser";
		}
		
		return "ok";
	}
}
