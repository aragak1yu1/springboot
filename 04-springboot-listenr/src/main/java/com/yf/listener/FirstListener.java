package com.yf.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Springboot整合listener
 * 
 * @author yangf
 *
 */
@WebListener()
public class FirstListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listner...init...");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	
	}
}
