package com.yf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yf.pojo.User;

/**
 * Thymeleaf入门
 * 
 * @author yangf
 *
 */
@Controller
public class DemoController {

	@RequestMapping("show1")
	public String showInfo(Model model) {
		model.addAttribute("msg", "thymeleaf 第一个案例");
		model.addAttribute("empryString", "");
		model.addAttribute("key", new Date());
		return "index";
	}
	
	@RequestMapping("show2")
	public String showInfo2(Model model) {
		model.addAttribute("sex", "男");
		model.addAttribute("id", "2");
		return "index2";
	}
	
	@RequestMapping("show3")
	public String showInfo3(Model model) {
		List<User> list = new ArrayList<>();
		list.add(new User(1, "张三", 20));
		list.add(new User(2, "李四", 21));
		list.add(new User(3, "王五", 22));
		list.add(new User(4, "赵六", 23));
		model.addAttribute("list", list);
		return "index3";
	}
	
	@RequestMapping("show4")
	public String showInfo4(Model model){
		Map<String, User> map = new HashMap<>();
		map.put("u1", new User(1, "张三", 20));
		map.put("u2", new User(2, "李四", 21));
		map.put("u3", new User(3, "王五", 22));
		model.addAttribute("map", map);
		return "index4";
	}
	
	@RequestMapping("show5")
	public String showInfo5(HttpServletRequest req){
		req.setAttribute("req", "HttpServletRequest");
		req.getSession().setAttribute("ses", "httpSession");
		req.getSession().getServletContext().setAttribute("app", "Application");
		return "index5";
	}
}
