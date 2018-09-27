package com.liuerchong.service.impl.job;

import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("taskTest")
public class TaskTest {

	/**
	 * 日志信息
	 */
	private final Logger log = LoggerFactory.getLogger(TaskTest.class);
	
	/**
	 * 生成一个1-100的随机数
	 *//*
	public void execute(JobExecutionContext context) throws JobExecutionException {
		int random = (int)(Math.random()*100);
		log.debug("生成的随机数为：" + random);
	}*/
	public void printTest(JobExecutionContext jobExecutionContext){
		
		System.out.println("test---------------------");
	}
	public void printTest2(){
		
		System.out.println("test2222222222s---------------------");
	}
}
