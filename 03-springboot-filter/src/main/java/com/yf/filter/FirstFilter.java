package com.yf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * springboot整合filter方式1
 * 
 * @author yangf
 *
 */
@WebFilter(filterName="firstFilter",urlPatterns="/hello")
public class FirstFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("进入filter");
		chain.doFilter(request, response);
		System.out.println("离开filter");
	}
}
