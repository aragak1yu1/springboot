package com.yf.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {
	
	public static void main(String[] args) throws Exception {
		// 创建job对象，要做什么事情
		JobDetail job = JobBuilder.newJob(QuartzDemo.class).build();
		
		// 创建trigger对象，什么时间做
		// 参数是trigger触发的时间
		// 1.简单时间:通过quartz提供的一个方法来完成简单的重复调用
		// 2.cron trigger:按照cron表达式来给定触发的时间
//		Trigger trigger = TriggerBuilder.newTrigger()
//								.withSchedule(SimpleScheduleBuilder.repeatSecondlyForever()).build();
		
		Trigger trigger = TriggerBuilder.newTrigger()
								.withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?")).build();
		// 创建scheduler对象，什么时间做什么事
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		scheduler.scheduleJob(job, trigger);
		
		scheduler.start();
	}
}
