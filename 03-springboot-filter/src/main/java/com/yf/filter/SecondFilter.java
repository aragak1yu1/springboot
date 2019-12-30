package com.yf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * springboot整合filter方式2
 * 
 * @author yangf
 *
 */
public class SecondFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("second filter in");
		chain.doFilter(request, response);
		System.out.println("second filter out");
	}
}
