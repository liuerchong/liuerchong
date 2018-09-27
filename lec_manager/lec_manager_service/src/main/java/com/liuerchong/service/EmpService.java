package com.liuerchong.service;

import com.liuerchong.DataGrid;

public interface EmpService {

	public DataGrid getEmpList(Integer page, Integer limit);

	/**
	 * 
	    * @Title: getEmpList
	    * @Description: 条件查询
	    * @param @param page 页码
	    * @param @param limit 每页显示的条数
	    * @param @param name 姓名
	    * @param @return    参数 数据列表
	    * @return DataGrid    返回类型
	    * @throws
	 */
	public DataGrid getEmpList(Integer page, Integer limit, String name);
}
