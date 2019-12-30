package com.yf.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * scheduled
 * @EnableScheduling 添加注解开启scheduled
 * 
 * @author yangf
 *
 */
@SpringBootApplication
@EnableScheduling
public class App {
	
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}
}
