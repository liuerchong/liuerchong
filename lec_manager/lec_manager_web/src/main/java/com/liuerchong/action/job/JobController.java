package com.liuerchong.action.job;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.quartz.SchedulerException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuerchong.job.pojo.ScheduleJob;
import com.liuerchong.service.job.JobTaskService;

@Controller
public class JobController {

	@Resource
	JobTaskService jobTaskService ;
	
	
	@RequestMapping("/addTask")
	public void addTask(ScheduleJob s){
		
		 s = new ScheduleJob();
		s.setBeanClass("com.liuerchong.service.impl.job.TaskTest");
		s.setCreatetime(new Date());
		s.setCronExpression("0/30 * * * * ?");
		s.setDescription("测试2");
		s.setIsConcurrent("1");
		s.setJobGroup("test");
		s.setJobid("kkkkkkkkkkkkkkkkkkkkk");
		s.setJobName("test");
		s.setJobStatus("1");
		s.setMethodName("printTest2");
		s.setSpringId("taskTest");
		s.setUpdatetime(null);
		jobTaskService.addTask(s);
	}
	
	@RequestMapping("/getTaskList")
	public void getTaskList(){
		
		
		List<ScheduleJob> allTask = jobTaskService.getAllTask();
		for (ScheduleJob scheduleJob : allTask) {
			System.out.println("************"+scheduleJob.getBeanClass());
		}
	}
	@RequestMapping("/getTask")
	public void getTaskById(String jobId){
		
		jobId="jjjjjjjjjjjjjjjj";
		ScheduleJob scheduleJob = jobTaskService.getTaskById(jobId);
		System.out.println("************"+scheduleJob.getMethodName());
	}
	
	@RequestMapping("/changeStatus")
	public void changeStatus(String jobId,String cmd) throws SchedulerException{
		
		jobId="jjjjjjjjjjjjjjjj";
		cmd="stop";
		 jobTaskService.changeStatus(jobId, cmd);
		//System.out.println("************"+scheduleJob.getMethodName());
	}
	
	
	
	
	
	
}
