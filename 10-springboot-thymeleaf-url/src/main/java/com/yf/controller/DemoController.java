package com.yf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf入门
 * 
 * @author yangf
 *
 */
@Controller
public class DemoController {

	@RequestMapping("{page}")
	public String showInfo(Model model, @PathVariable("page") String page) {
		return page;
	}
}
