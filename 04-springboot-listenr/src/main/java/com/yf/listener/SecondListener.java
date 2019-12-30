package com.yf.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Springboot整合listener
 * 
 * @author yangf
 *
 */
public class SecondListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listner second...init...");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	
	}
}
