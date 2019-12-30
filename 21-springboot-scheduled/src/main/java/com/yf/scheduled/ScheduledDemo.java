package com.yf.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Scheduled定时任务
 * 
 * @author yangf
 *
 */
@Component //不属于业务也不属于持久
public class ScheduledDemo {
	
	/**
	 * 定时任务方法
	 * @Scheduled 设置定时任务
	 * cron属性:cron表达式，定时任务触发时间的一个字符串表达形式
	 * 
	 */
	@Scheduled(cron="3 * * * * ?")
	public void scheduledMethod(){
		System.out.println("定时器被触发" + new Date());
	}
}
