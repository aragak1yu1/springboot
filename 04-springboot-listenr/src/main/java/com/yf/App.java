package com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * springboot整合listener 方式1
 * 
 * @author yangf
 *
 */
@SpringBootApplication
@ServletComponentScan
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
