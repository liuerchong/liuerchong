package com.liuerchong.action.job.provider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.springframework.context.ApplicationContext;

import com.liuerchong.job.pojo.ScheduleJob;
import com.liuerchong.util.SpringUtils;


public class JobUtils {

	public final static Logger log = Logger.getLogger(JobUtils.class);
    public static final String STATUS_RUNNING = "1"; //启动状态
    public static final String STATUS_NOT_RUNNING = "0"; //未启动状态
    public static final String CONCURRENT_IS = "1";
    public static final String CONCURRENT_NOT = "0";

    private ApplicationContext ctx;

    
    public static void invokMethod(ScheduleJob scheduleJob,JobExecutionContext context) {
        Object object = null;
        Class clazz = null;
        if (StringUtils.isNotBlank(scheduleJob.getSpringId())) {
            object = SpringUtils.getBean(scheduleJob.getSpringId());
        } else if (StringUtils.isNotBlank(scheduleJob.getBeanClass())) {
            try {
                clazz = Class.forName(scheduleJob.getBeanClass());
                object = clazz.newInstance();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        if (object == null) {
            log.error("任务名称 = [" + scheduleJob.getJobName() + "]---------------未启动成功，请检查是否配置正确！！！");
            return;
        }
        clazz = object.getClass();
        Method method = null;
        try {
            method = clazz.getMethod(scheduleJob.getMethodName(), new Class[] {JobExecutionContext.class});
        } catch (NoSuchMethodException e) {
            log.error("任务名称 = [" + scheduleJob.getJobName() + "]---------------未启动成功，方法名设置错误！！！");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        if (method != null) {
            try {
                method.invoke(object, new Object[] {context});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        log.info("任务名称 = [" + scheduleJob.getJobName() + "]----------启动成功");
    }
}
