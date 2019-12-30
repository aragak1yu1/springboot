package com.yf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("showDemo1")
	public String showDemo1(){
		
		String str = null;
		str.length();
		
		return "index";
	}
	
	@RequestMapping("showDemo2")
	public String showDemo2(){
		
		int a = 100 / 0;
		
		return "index";
	}
}
