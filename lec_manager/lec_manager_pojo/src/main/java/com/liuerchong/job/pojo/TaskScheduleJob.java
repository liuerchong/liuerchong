package com.liuerchong.job.pojo;

import java.util.Date;

public class TaskScheduleJob {

	
	  
	  private String job_id;
	  private String job_name;
	  private String job_group;
	  private String job_status;
	  private String cron_expression;
	  private String description;
	  private String bean_class;
	  private String is_concurrent;
	  private String spring_id;
	  private String method_name;
	  private Date create_time;
	  private Date update_time;
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getJob_group() {
		return job_group;
	}
	public void setJob_group(String job_group) {
		this.job_group = job_group;
	}
	public String getJob_status() {
		return job_status;
	}
	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}
	public String getCron_expression() {
		return cron_expression;
	}
	public void setCron_expression(String cron_expression) {
		this.cron_expression = cron_expression;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBean_class() {
		return bean_class;
	}
	public void setBean_class(String bean_class) {
		this.bean_class = bean_class;
	}
	public String getIs_concurrent() {
		return is_concurrent;
	}
	public void setIs_concurrent(String is_concurrent) {
		this.is_concurrent = is_concurrent;
	}
	public String getSpring_id() {
		return spring_id;
	}
	public void setSpring_id(String spring_id) {
		this.spring_id = spring_id;
	}
	public String getMethod_name() {
		return method_name;
	}
	public void setMethod_name(String method_name) {
		this.method_name = method_name;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	  
	  
	  
}
