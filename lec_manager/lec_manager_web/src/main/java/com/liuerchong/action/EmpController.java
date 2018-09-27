package com.liuerchong.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuerchong.DataGrid;
import com.liuerchong.service.EmpService;

@Controller
//@RequestMapping("/emp")
public class EmpController 
//extends BaseController
{

	@Resource
	private EmpService empServiceImpl;
	
	
	
//	
	public EmpController(){
		
		System.out.println("chushihua ");
	}
	public EmpService getEmpServiceImpl() {
		return empServiceImpl;
	}
	public void setEmpServiceImpl(EmpService empServiceImpl) {
		this.empServiceImpl = empServiceImpl;
	}
	@RequestMapping("/empList")
	public String toUserList(){
		return "emp/empList";
	}
	
	@RequestMapping("/getEmpList")
	@ResponseBody
	public DataGrid getUserList(Integer page,Integer limit,String name){
		page = (null==page)?1:page;
		limit = (null==limit)?10:limit;
		
		DataGrid empList = empServiceImpl.getEmpList(page,limit,name);
		System.out.println("uuuuuuuuuuu");
		return empList;
	}
	
}
