package com.liuerchong.service.impl.ws;

import com.liuerchong.service.ws.WheatherService;

public class WheatherServiceImpl implements WheatherService{

	public String getInfo(String city) {
		if("北京".equals(city)){
			
			return "晴天";
		}
		return "雾霾";
	}

}
