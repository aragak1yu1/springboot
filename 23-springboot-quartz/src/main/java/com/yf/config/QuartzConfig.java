package com.yf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.yf.quartz.QuartzDemo;

/**
 * Quartz配置类
 * 
 * @author yangf
 *
 */
@Configuration
public class QuartzConfig {
	
	@Autowired
	private MyAdataleFactory myAdataleFactory;
	
	/**
	 * 创建job对象
	 */
	@Bean
	public JobDetailFactoryBean jobDetailFactoryBean(){
		JobDetailFactoryBean fac = new JobDetailFactoryBean();
		fac.setJobClass(QuartzDemo.class);
		return fac;
	}
	
	/**
	 * 创建Trigger对象1
	 */
//	@Bean
//	public SimpleTriggerFactoryBean simpleTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean) {
//		SimpleTriggerFactoryBean sim = new SimpleTriggerFactoryBean();
//		sim.setJobDetail(jobDetailFactoryBean.getObject());
//		// 参数为毫秒数
//		sim.setRepeatInterval(1000);
//		return sim;
//	}
	
	/**
	 * 创建Trigger对象2
	 */
	@Bean
	public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean) {
		CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
		bean.setJobDetail(jobDetailFactoryBean.getObject());
		bean.setCronExpression("0/2 * * * * ?");
		return bean;
	}
	
	
	/**
	 * 创建scheduler对象1
	 */
//	@Bean
//	public SchedulerFactoryBean schedulerFactoryBean(SimpleTriggerFactoryBean simpleTriggerFactoryBean){
//		SchedulerFactoryBean bean = new SchedulerFactoryBean();
//		bean.setTriggers(simpleTriggerFactoryBean.getObject());
//		return bean;
//	}
	
	/**
	 * 创建scheduler对象2
	 */
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean){
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		bean.setTriggers(cronTriggerFactoryBean.getObject());
		bean.setJobFactory(myAdataleFactory);
		return bean;
	}
	
}
