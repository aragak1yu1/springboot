package com.yf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yf.mapper") //mapper扫描
public class App {
	
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}
}