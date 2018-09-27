package com.liuerchong.service.impl.job;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.liuerchong.job.pojo.ScheduleJob;
import com.liuerchong.service.job.JobUtils;

public class QuartzJobFactory implements Job {
	   public final Logger log = Logger.getLogger(this.getClass());

	   public void execute(JobExecutionContext context) throws JobExecutionException {
	      ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
	      JobUtils.invokMethod(scheduleJob,context);
	   }
	}
