package com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.yf.listener.SecondListener;

/**
 * Springboot整合listener方式2
 * 
 * @author yangf
 *
 */
@SpringBootApplication
public class App2 {
	
	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	
	@Bean
	public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
		ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
		return bean;
	} 
}
