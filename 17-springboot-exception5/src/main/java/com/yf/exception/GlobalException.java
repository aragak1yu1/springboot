package com.yf.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class GlobalException implements HandlerExceptionResolver {
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		ModelAndView mv = new ModelAndView();
		if (ex instanceof NullPointerException) {
			mv.setViewName("error2");
		} else if (ex instanceof ArithmeticException) {
			mv.setViewName("error1");
		}
		mv.addObject("error", ex);
		return mv;
	}
}
