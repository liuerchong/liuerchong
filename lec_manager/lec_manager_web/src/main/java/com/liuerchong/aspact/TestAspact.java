package com.liuerchong.aspact;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.liuerchong.log.pojo.BaseBizlog;
import com.liuerchong.service.log.LogService;

@Aspect

public class TestAspact {

	public TestAspact(){
		System.out.println("+++++++++++++++++++++");
		System.out.println("SystemLogAspect实例化");
		System.out.println("+++++++++++++++++++++");
	}
	 //注入Service用于把日志保存数据库  
    @Resource  //这里我用resource注解
     LogService logService; 
    
  //Controller层切点  
    @Pointcut("@annotation(com.liuerchong.annotation.ActionLog)")  
    public  void controllerAspect() {  
    	//System.out.println("qieru******************s");
    }  
    
    @Before(value="controllerAspect()")    
    public  void doBefore(JoinPoint joinPoint) {    
   
       HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();    
       //HttpSession session = request.getSession();    
       //读取session中的用户    
       //ActiveUser user = UserUtil.getUserFromSession(request.getSession());   
       //请求的IP    
       String ip = request.getRemoteAddr(); 
       String logContent = "";
        try { 
       	 Object[] parames = joinPoint.getArgs();//获取目标方法体参数   
	        String classType = joinPoint.getTarget().getClass().getName();  
	        Class<?> clazz = Class.forName(classType);  
	        String clazzName = clazz.getName();  
	        String clazzSimpleName = clazz.getSimpleName();  
	        String methodName = joinPoint.getSignature().getName(); 
	        //String params = "";    
           System.out.println("=====前置通知开始=====");    
           System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
           System.out.println("请求参数:" + logContent);
           //*========数据库日志=========*//    
           System.out.println("=====前置通知结束=====");    
       }  catch (Exception e) {    
           //记录本地异常日志    
       }    
   }    
}
