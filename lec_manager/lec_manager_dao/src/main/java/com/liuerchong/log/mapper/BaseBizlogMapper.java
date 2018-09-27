package com.liuerchong.log.mapper;

import com.liuerchong.log.pojo.BaseBizlog;
import com.liuerchong.log.pojo.BaseBizlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBizlogMapper {
    int countByExample(BaseBizlogExample example);

    int deleteByExample(BaseBizlogExample example);

    int deleteByPrimaryKey(String logId);

    int insert(BaseBizlog record);

    int insertSelective(BaseBizlog record);

    List<BaseBizlog> selectByExample(BaseBizlogExample example);

    BaseBizlog selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") BaseBizlog record, @Param("example") BaseBizlogExample example);

    int updateByExample(@Param("record") BaseBizlog record, @Param("example") BaseBizlogExample example);

    int updateByPrimaryKeySelective(BaseBizlog record);

    int updateByPrimaryKey(BaseBizlog record);
}