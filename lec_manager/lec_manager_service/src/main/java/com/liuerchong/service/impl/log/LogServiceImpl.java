package com.liuerchong.service.impl.log;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuerchong.log.mapper.BaseBizlogMapper;
import com.liuerchong.log.pojo.BaseBizlog;
import com.liuerchong.service.log.LogService;

@Service("logService")
public  class LogServiceImpl implements LogService {

	@Resource
	BaseBizlogMapper baseBizlogMapper ;


	@Override
	public BaseBizlog selectSystemLog(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int deleteSystemLog(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int insert(BaseBizlog record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
