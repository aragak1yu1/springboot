package com.yf.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class GlobalException {
	
	/**
	 * 返回值类型必须是SimpleMappingExceptionResolver
	 */
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		Properties mappings = new Properties();
		// key-> 异常类型全名
		// value->视图名
		mappings.put("java.lang.ArithmeticException", "error1");
		mappings.put("java.lang.NullPointerException", "error2");
		resolver.setExceptionMappings(mappings);
		return resolver;
	}
}
