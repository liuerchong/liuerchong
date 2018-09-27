package com.liuerchong.service.job;

import java.util.List;

import javax.annotation.PostConstruct;

import org.quartz.SchedulerException;

import com.liuerchong.job.pojo.ScheduleJob;

public interface JobTaskService {

	 /**
	    * 从数据库中取 区别于getAllJob
	    * 
	    * @return
	    */
	   public List<ScheduleJob> getAllTask() ;
	   /**
	    * 添加到数据库中 区别于addJob
	    */
	   public void addTask(ScheduleJob job) ;
	   /**
	    * 从数据库中查询job
	    */
	   public ScheduleJob getTaskById(String jobId) ;

	   /**
	    * 更改任务状态
	    * 
	    * @throws SchedulerException
	    */
	   public void changeStatus(String jobId, String cmd) throws SchedulerException ;

	   /**
	    * 更改任务 cron表达式
	    * 
	    * @throws SchedulerException
	    */
	   public void updateCron(String jobId, String cron) throws SchedulerException ;
	   /**
	    * 添加任务
	    * 
	    * @throws SchedulerException
	    */
	   public void addJob(ScheduleJob job) throws SchedulerException ;
	   @PostConstruct
	   public void init() throws Exception ;

	   /**
	    * 获取所有计划中的任务列表
	    * 
	    * @return
	    * @throws SchedulerException
	    */
	   public List<ScheduleJob> getAllJob() throws SchedulerException ;

	   /**
	    * 所有正在运行的job
	    * 
	    * @return
	    * @throws SchedulerException
	    */
	   public List<ScheduleJob> getRunningJob() throws SchedulerException;

	   /**
	    * 暂停一个job
	    * 
	    * @param scheduleJob
	    * @throws SchedulerException
	    */
	   public void pauseJob(ScheduleJob scheduleJob) throws SchedulerException ;

	   /**
	    * 恢复一个job
	    * 
	    * @param scheduleJob
	    * @throws SchedulerException
	    */
	   public void resumeJob(ScheduleJob scheduleJob) throws SchedulerException ;
	   /**
	    * 删除一个job
	    * 
	    * @param scheduleJob
	    * @throws SchedulerException
	    */
	   public void deleteJob(ScheduleJob scheduleJob) throws SchedulerException ;
	   /**
	    * 立即执行job
	    * 
	    * @param scheduleJob
	    * @throws SchedulerException
	    */
	   public void runAJobNow(ScheduleJob scheduleJob) throws SchedulerException ;

	   /**
	    * 更新job时间表达式
	    * 
	    * @param scheduleJob
	    * @throws SchedulerException
	    */
	   public void updateJobCron(ScheduleJob scheduleJob) throws SchedulerException ;

}
