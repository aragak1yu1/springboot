package com.yf.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component("MyAdataleFactory")
public class MyAdataleFactory extends AdaptableJobFactory {
	
	// 将一个对象添加到spring容器中，并且完成该对象的注入
	@Autowired
	private AutowireCapableBeanFactory autowireCapableBeanFactory;
	
	/**
	 * 
	 * 该方法需要将实例化的任务对象手动添加到spring容器中 并且完成注入
	 */
	@Override
	protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
		Object obj = super.createJobInstance(bundle);
		autowireCapableBeanFactory.autowireBean(obj);
		return obj;
	}
}
