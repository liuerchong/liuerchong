package com.liuerchong.service.log;

import com.liuerchong.log.pojo.BaseBizlog;

public interface LogService {

    int deleteSystemLog(String id);
    
    int insert(BaseBizlog record);
    
    BaseBizlog selectSystemLog(String id);
    
}
