package com.yf.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
	
	/**
	 * 处理算数异常
	 * 
	 */
	@ExceptionHandler(value=java.lang.ArithmeticException.class)
	public ModelAndView arithmeticExceptionHandler(Exception ex){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", ex.toString());
		mv.setViewName("error1");
		return mv;
	}
	
	/**
	 * 处理空指针异常
	 * 
	 */
	@ExceptionHandler(value=java.lang.NullPointerException.class)
	public ModelAndView nullPointerExceptionHandler(Exception ex){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", ex.toString());
		mv.setViewName("error2");
		return mv;
	}
}
