package com.yf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springLoader
 * 
 * @author yangf
 *
 */
@Controller
public class UsersController {
	
	@RequestMapping("show")
	public String showPage(){
		System.out.println("show211");
		return "index";
	}
}
