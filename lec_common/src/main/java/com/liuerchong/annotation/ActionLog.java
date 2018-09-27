package com.liuerchong.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ActionLog {

	/**
	* 当前操作组别
	* 一般以 Controller 的 RequestMapping命名
	* @return
	*/
	    String actionGroup() default "";
	    
	    /**
	     * 操作类型
	     * 一般定义/create, /update, /delete分别表示是新增，修改，删除
	     * @return
	     */
	    String actionType() default "";
	    
	    /**
	     * 操作描述
	     * @return
	     */
	    String actionDesc() default "";
	  
	    /**
	     * 是否插入该条操做纪录至数据库
	     * @return
	     */
	    boolean insertDb() default false;
	    
}
