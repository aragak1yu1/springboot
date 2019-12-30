package com.yf.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.yf.service.UserServiceImpl;

/**
 * JOB类
 * 
 * @author yangf
 *
 */
public class QuartzDemo implements Job {

	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		userServiceImpl.addUser();
		System.out.println("execute" + new Date());
	}
}
