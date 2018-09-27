package com.liuerchong.log.mapper;

import com.liuerchong.log.pojo.BaseErrorlog;
import com.liuerchong.log.pojo.BaseErrorlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseErrorlogMapper {
    int countByExample(BaseErrorlogExample example);

    int deleteByExample(BaseErrorlogExample example);

    int insert(BaseErrorlog record);

    int insertSelective(BaseErrorlog record);

    List<BaseErrorlog> selectByExample(BaseErrorlogExample example);

    int updateByExampleSelective(@Param("record") BaseErrorlog record, @Param("example") BaseErrorlogExample example);

    int updateByExample(@Param("record") BaseErrorlog record, @Param("example") BaseErrorlogExample example);
}