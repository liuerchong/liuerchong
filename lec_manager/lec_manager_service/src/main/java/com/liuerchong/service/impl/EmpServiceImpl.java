package com.liuerchong.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuerchong.DataGrid;
import com.liuerchong.annotation.ActionLog;
import com.liuerchong.mapper.EmpMapper;
import com.liuerchong.pojo.Emp;
import com.liuerchong.pojo.EmpExample;
import com.liuerchong.pojo.EmpExample.Criteria;
import com.liuerchong.service.EmpService;

@Service("empService")
/**
 * 
    * @ClassName: EmpServiceImpl
    * @Description: empServices实现类
    * @author liuerchong
    * @date 2018年9月12日
    * @Project ：lec_manager_service
 */
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
	
	public EmpMapper getEmpMapper() {
		return empMapper;
	}


	public void setEmpMapper(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}


	/**
	 * 获取emp列表，分页
	 */
	public DataGrid getEmpList(Integer page, Integer limit) {
		DataGrid dataGrid = null;
		try {
			//设置分页信息
			PageHelper.startPage(page, limit,true);
			dataGrid = new DataGrid();
			EmpExample empExample = new EmpExample();
			Criteria criteria = empExample.createCriteria();
			/**
			 * 此列表查询语句必须写在分页底下，不然会导致分页无效，会查询全部
			 */
			List<Emp> empList = empMapper.selectByExample(empExample);
			dataGrid.setData(empList);
			long count = empMapper.countByExample(empExample);
			//取分页结果
			PageInfo<Emp> pageInfo = new PageInfo<>(empList);
			
			//List<Emp> list = pageInfo.getList();
			//取总记录数
			long total = pageInfo.getTotal();
			
			dataGrid.setCount(total);
			
		} catch (Exception e) {
			dataGrid.setCode(1);
			throw e;
		}
		dataGrid.setCode(0);
		return dataGrid;
	}


	public DataGrid getEmpList(Integer page, Integer limit, String name) {
		DataGrid dataGrid = null;
		try {
			//设置分页信息
			PageHelper.startPage(page, limit,true);
			dataGrid = new DataGrid();
			EmpExample empExample = new EmpExample();
			//封装条件
			Criteria criteria = empExample.createCriteria();
			if (!StringUtils.isBlank(name)) {
				
				criteria.andNameLike("%"+name+"%");
			}
			/**
			 * 此列表查询语句必须写在分页底下，不然会导致分页无效，会查询全部
			 */
			List<Emp> empList = empMapper.selectByExample(empExample);
			dataGrid.setData(empList);
			long count = empMapper.countByExample(empExample);
			//取分页结果
			PageInfo<Emp> pageInfo = new PageInfo<>(empList);
			
			//List<Emp> list = pageInfo.getList();
			//取总记录数
			long total = pageInfo.getTotal();
			
			dataGrid.setCount(total);
			
		} catch (Exception e) {
			dataGrid.setCode(1);
			throw e;
		}
		dataGrid.setCode(0);
		return dataGrid;
	}



}
