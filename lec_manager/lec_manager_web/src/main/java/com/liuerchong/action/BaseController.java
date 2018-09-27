package com.liuerchong.action;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
    * @ClassName: BaseController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年9月10日
    * /user/toList
    *
 */
public class BaseController {

	@RequestMapping("/{fnMo}/{op}")
	public String toList(@PathVariable String fnMo,@PathVariable String op ){
		System.out.println("功能模块为"+fnMo+"功能操作为"+op);
		String path = fnMo+"/"+op;
		System.out.println(path);
		return "/"+fnMo+"/"+op;
	}
}
