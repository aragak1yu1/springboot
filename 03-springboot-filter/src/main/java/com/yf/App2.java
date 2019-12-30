package com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.yf.filter.SecondFilter;
import com.yf.servlet.HelloServlet2;

@SpringBootApplication
public class App2 {
	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet2());
		bean.addUrlMappings("/hello2");
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean fil = new FilterRegistrationBean(new SecondFilter());
		fil.addUrlPatterns("/hello2");
		return fil;
	}
}
