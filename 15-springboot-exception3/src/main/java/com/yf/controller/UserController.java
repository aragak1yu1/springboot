package com.yf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	/**
	 * springboot 处理异常方式1 自定义错误页面
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("show")
	public String showInfo(){
		String str= null;
		str.length();
		return "index";
	}
	
	@RequestMapping("show2")
	public String showInfo2(){
		int a = 100 / 0;
		return "index";
	}
}
