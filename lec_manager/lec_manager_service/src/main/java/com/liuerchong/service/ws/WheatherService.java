package com.liuerchong.service.ws;

import javax.jws.WebService;


@WebService
public interface WheatherService {

	public String getInfo(String  city);
}
