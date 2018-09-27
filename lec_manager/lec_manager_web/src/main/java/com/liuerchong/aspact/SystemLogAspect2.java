package com.liuerchong.aspact;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.MethodInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.liuerchong.annotation.ActionLog;
import com.liuerchong.log.pojo.BaseBizlog;
import com.liuerchong.service.log.LogService;


@Aspect 
@Component
public class SystemLogAspect2 {

	public SystemLogAspect2(){
		System.out.println("+++++++++++++++++++++");
		System.out.println("SystemLogAspect实例化");
		System.out.println("+++++++++++++++++++++");
	}
	 //注入Service用于把日志保存数据库  
    @Resource  //这里我用resource注解
     LogService logService;    
    //本地异常日志记录对象    
     private  static  final Logger logger = LoggerFactory.getLogger(SystemLogAspect. class);    
    
     private static String[] types = { "java.lang.Integer", "java.lang.Double",  
             "java.lang.Float", "java.lang.Long", "java.lang.Short",  
             "java.lang.Byte", "java.lang.Boolean", "java.lang.Char",  
             "java.lang.String", "int", "double", "long", "short", "byte",  
             "boolean", "char", "float" }; 
    //Service层切点    
    @Pointcut("@annotation(com.liuerchong.annotation.ActionLog)")    
     public  void serviceAspect() {    
    }    
    
    //Controller层切点    
    @Pointcut("@annotation(com.liuerchong.annotation.ActionLog)")    
     public  void controllerAspect() {    
    }    
    
    /**  
     * 前置通知 用于拦截Controller层记录用户的操作  
     *  
     * @param joinPoint 切点  
     */    
    @Before("controllerAspect()")    
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
 	        String[] paramNames = getFieldsName(this.getClass(), clazzName, methodName);  
 	        
 	         logContent = writeLogInfo(paramNames, joinPoint); 
            //*========控制台输出=========*//    
            logger.info("=====前置通知开始=====");    
            logger.info("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            logger.info("方法描述:" + getControllerMethodDescription(joinPoint));    
            //logger.info("请求人:" + user.getUsername());    
            //logger.info("请求人编号:" + user.getUsercode());    
            logger.info("请求IP:" + ip);    
            logger.info("请求参数:" + logContent);
            System.out.println("=====前置通知开始=====");    
            System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            System.out.println("请求参数:" + logContent);
            //*========数据库日志=========*//    
            BaseBizlog log = new BaseBizlog();
           // log.setLogId(NumUtil.getLogId());
            log.setOptDesc(getControllerMethodDescription(joinPoint));
            //log.setDescription(getControllerMethodDescription(joinPoint));    
            log.setOptMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            log.setOptStatus("0");    
            log.setReqIp(ip);    
           // log.setExceptionCode( null);    
            log.setOptParems(logContent);    
            //log.setUserName(user.getUsername());
            //log.setAccount(user.getUsercode());
            //log.setLoginDate(new Date()); 
            //log.setOptStatus("1");
            //保存数据库    
            logService.insert(log);    
            System.out.println("=====前置通知结束=====");    
        }  catch (Exception e) {    
            //记录本地异常日志    
            logger.error("==前置通知异常==");    
            logger.error("异常信息:{}", e.getMessage());    
        }    
    }    
    
    /**  
     * 异常通知 用于拦截service层记录异常日志  
     *  
     * @param joinPoint  
     * @param e  
     */    
    @AfterThrowing(pointcut = "serviceAspect()", throwing = "e")    
     public  void doAfterThrowing(JoinPoint joinPoint, Throwable e) { 
    	String logContent = "";
    	try {
    		 HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();    
    	        HttpSession session = request.getSession();    
    	        //读取session中的用户    
    	       // ActiveUser user = UserUtil.getUserFromSession(session);    
    	        //获取请求ip    
    	        String ip = request.getRemoteAddr();    
    	        //获取用户请求方法的参数并序列化为JSON格式字符串   
    	        Object[] parames = joinPoint.getArgs();//获取目标方法体参数   
    	        String classType = joinPoint.getTarget().getClass().getName();  
    	        Class<?> clazz = Class.forName(classType);  
    	        String clazzName = clazz.getName();  
    	        String clazzSimpleName = clazz.getSimpleName();  
    	        String methodName = joinPoint.getSignature().getName(); 
    	        //String params = "";    
    	        String[] paramNames = getFieldsName(this.getClass(), clazzName, methodName);  
    	        
    	         logContent = writeLogInfo(paramNames, joinPoint); 
    	         /*if (joinPoint.getArgs() !=  null && joinPoint.getArgs().length > 0) {    
    	             for ( int i = 0; i < joinPoint.getArgs().length; i++) {    
    	                params += JSONUtil.toJsonString(joinPoint.getArgs()[i]) + ";";    
    	            }    
    	        }    */
    	         try {    
    	              /*========控制台输出=========*/    
    	            System.out.println("=====异常通知开始=====");    
    	            System.out.println("异常代码:" + e.getClass().getName());    
    	            System.out.println("异常信息:" + e.getMessage());    
    	            System.out.println("异常方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
    	            System.out.println("方法描述:" + getServiceMthodDescription(joinPoint));    
    	          //  System.out.println("请求人:" + user.getUsername());    
    	           // System.out.println("请求人:" + user.getUsercode());    
    	            System.out.println("请求IP:" + ip);    
    	            System.out.println("请求参数:" + logContent);    
    	               /*==========数据库日志=========*/    
    	           /* Log log = SpringContextHolder.getBean("logxx");    
    	            log.setDescription(getServiceMthodDescription(joinPoint));    
    	            log.setExceptionCode(e.getClass().getName());    
    	            log.setType("1");    
    	            log.setExceptionDetail(e.getMessage());    
    	            log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
    	            log.setParams(params);    
    	            log.setCreateBy(user);    
    	            log.setCreateDate(DateUtil.getCurrentDate());    
    	            log.setRequestIp(ip);  */  
    	            //保存数据库    
    	           // logService.add(log);
    	            BaseBizlog log = new BaseBizlog();
    	            //log.setLogId(NumUtil.getLogId());
    	            log.setOptDesc(getControllerMethodDescription(joinPoint));
    	            //log.setDescription(getControllerMethodDescription(joinPoint));    
    	            log.setOptMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
    	            //log.setOptStatus("0");    
    	            log.setReqIp(ip);    
    	            //log.setExceptionCode( null);    
    	            log.setOptParems(logContent);    
    	           // log.setUserName(user.getUsername());
    	           // log.setAccount(user.getUsercode());
    	           // log.setLoginDate(new Date()); 
    	           // log.setOptStatus("1");
    	            //log.setExceptionCode(e.getClass().getName());    
    	            //log.setOptStatus(optStatus);    
    	           // log.setOptError(e.getMessage());
    	            //保存数据库    
    	            logService.insert(log);  
    	            System.out.println("=====异常通知结束=====");    
    	        }  catch (Exception ex) {    
    	            //记录本地异常日志    
    	            logger.error("==异常通知异常==");    
    	            logger.error("异常信息:{}", ex.getMessage());    
    	        }    
		} catch (Exception e2) {
			// TODO: handle exception
			logger.error("异常方法:{}异常代码:{}异常信息:{}参数:{}", joinPoint.getTarget().getClass().getName() + joinPoint.getSignature().getName(), e.getClass().getName(), e.getMessage(), logContent);    
		}
       
         /*==========记录本地异常日志==========*/    
    
    }    
    
    
    /**  
     * 获取注解中对方法的描述信息 用于service层注解  
     *  
     * @param joinPoint 切点  
     * @return 方法描述  
     * @throws Exception  
     */    
     public  static String getServiceMthodDescription(JoinPoint joinPoint)    
             throws Exception {    
        String targetName = joinPoint.getTarget().getClass().getName();    
        String methodName = joinPoint.getSignature().getName();    
        Object[] arguments = joinPoint.getArgs();    
        Class targetClass = Class.forName(targetName);    
        Method[] methods = targetClass.getMethods();    
        String description = "";    
         for (Method method : methods) {    
             if (method.getName().equals(methodName)) {    
                Class[] clazzs = method.getParameterTypes();    
                 if (clazzs.length == arguments.length) {    
                    description = method.getAnnotation(ActionLog. class).actionDesc();    
                     break;    
                }    
            }    
        }    
         return description;    
    }    
    
    /**  
     * 获取注解中对方法的描述信息 用于Controller层注解  
     *  
     * @param joinPoint 切点  
     * @return 方法描述  
     * @throws Exception  
     */    
     public  static String getControllerMethodDescription(JoinPoint joinPoint)  throws Exception {    
        String targetName = joinPoint.getTarget().getClass().getName();    
        String methodName = joinPoint.getSignature().getName();    
        Object[] arguments = joinPoint.getArgs();    
        Class targetClass = Class.forName(targetName);    
        Method[] methods = targetClass.getMethods();    
        String description = "";    
         for (Method method : methods) {    
             if (method.getName().equals(methodName)) {    
                Class[] clazzs = method.getParameterTypes();    
                 if (clazzs.length == arguments.length) {    
                    description = method.getAnnotation(ActionLog. class).actionDesc();    
                     break;    
                }    
            }    
        }    
         return description;    
    }  
     /** 
      * 得到方法参数的名称 
      * @param cls 
      * @param clazzName 
      * @param methodName 
      * @return 
      * @throws NotFoundException 
      */  
    /* private static String[] getFieldsName(Class cls, String clazzName, String methodName) throws NotFoundException{  
         ClassPool pool = ClassPool.getDefault();  
         //ClassClassPath classPath = new ClassClassPath(this.getClass());  
         ClassClassPath classPath = new ClassClassPath(cls);  
         pool.insertClassPath(classPath);  
           
         CtClass cc = pool.get(clazzName);  
         CtMethod cm = cc.getDeclaredMethod(methodName);  
         MethodInfo methodInfo = cm.getMethodInfo();  
         CodeAttribute codeAttribute = methodInfo.getCodeAttribute();  
         LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);  
         if (attr == null) {  
             // exception  
         }  
         String[] paramNames = new String[cm.getParameterTypes().length];  
         int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;  
         for (int i = 0; i < paramNames.length; i++){  
             paramNames[i] = attr.variableName(i + pos); //paramNames即参数名  
         }  
         return paramNames;  
     }  */
     /** 
      * 得到参数的值 
      * @param obj 
      */  
     public static String getFieldsValue(Object obj) {  
         Field[] fields = obj.getClass().getDeclaredFields();  
         String typeName = obj.getClass().getName();  
         for (String t : types) {  
             if(t.equals(typeName))  
                 return "";  
         }  
         StringBuilder sb = new StringBuilder();  
         sb.append("【");  
         for (Field f : fields) {  
             f.setAccessible(true);  
             try {  
                 for (String str : types) {  
                     if (f.getType().getName().equals(str)){  
                         sb.append(f.getName() + " = " + f.get(obj)+"; ");  
                     }  
                 }  
             } catch (IllegalArgumentException e) {  
                 e.printStackTrace();  
             } catch (IllegalAccessException e) {  
                 e.printStackTrace();  
             }  
         }  
         sb.append("】");  
         return sb.toString();  
     }  
     private static String writeLogInfo(String[] paramNames, JoinPoint joinPoint){  
         Object[] args = joinPoint.getArgs();  
         StringBuilder sb = new StringBuilder();  
         boolean clazzFlag = true;  
         for(int k=0; k<args.length; k++){  
             Object arg = args[k];  
             sb.append(paramNames[k]+" ");  
             // 获取对象类型  
             String typeName = arg.getClass().getName();  
               
             for (String t : types) {  
                 if (t.equals(typeName)) {  
                     sb.append("=" + arg+"; ");  
                 }  
             }  
             if (clazzFlag) {  
                 sb.append(getFieldsValue(arg));  
             }  
         }  
         return sb.toString();  
     } 

     /** 
      * 得到方法参数的名称 
      * @param cls 
      * @param clazzName 
      * @param methodName 
      * @return 
      * @throws NotFoundException 
      */  
     private static String[] getFieldsName(Class cls, String clazzName, String methodName) throws NotFoundException{  
         ClassPool pool = ClassPool.getDefault();  
         //ClassClassPath classPath = new ClassClassPath(this.getClass());  
         ClassClassPath classPath = new ClassClassPath(cls);  
         pool.insertClassPath(classPath);  
           
         CtClass cc = pool.get(clazzName);  
         CtMethod cm = cc.getDeclaredMethod(methodName);  
         MethodInfo methodInfo = cm.getMethodInfo();  
         CodeAttribute codeAttribute = methodInfo.getCodeAttribute();  
         LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);  
         if (attr == null) {  
             // exception  
         }  
         String[] paramNames = new String[cm.getParameterTypes().length];  
         int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;  
         for (int i = 0; i < paramNames.length; i++){  
             paramNames[i] = attr.variableName(i + pos); //paramNames即参数名  
         }  
         return paramNames;  
     }  
}

