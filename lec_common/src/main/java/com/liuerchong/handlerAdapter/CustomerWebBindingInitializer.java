package com.liuerchong.handlerAdapter;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class CustomerWebBindingInitializer implements WebBindingInitializer{

    public void initBinder(WebDataBinder binder, WebRequest request) {  
		// String类型转换，将所有传递进来的String进行前后空格处理， null字符串处理
	   /* binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
	        @Override
	        public void setAsText(String text) {
	            setValue(text == null ? null : text.trim());
	        }
	 
	        @Override
	        public String getAsText() {
	            Object value = getValue();
	            return value != null ? value.toString() : "";
	        }
	    });*/
	    // Date 类型转换
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false) );
/*	    binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
	    	@Override
	    	public void setAsText(String text) {
	    		setValue(DateUtils.parseDate(text));
	    	}
	    	
	    	@Override
	    	public String getAsText() {
	    		Date date = (Date) getValue();
	    		return DateUtils.formatDate(date, "yyyy-MM-dd");
	    	}
	    });
*/       // binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));  
    }  
	/*protected void initBinder(WebDataBinder binder) {
	    
	 
	   
	}*/
}
