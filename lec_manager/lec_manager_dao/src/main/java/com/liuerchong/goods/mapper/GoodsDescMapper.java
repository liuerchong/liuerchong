package com.liuerchong.goods.mapper;

import com.liuerchong.goods.pojo.GoodsDesc;
import com.liuerchong.goods.pojo.GoodsDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsDescMapper {
    int countByExample(GoodsDescExample example);

    int deleteByExample(GoodsDescExample example);

    int insert(GoodsDesc record);

    int insertSelective(GoodsDesc record);

    List<GoodsDesc> selectByExample(GoodsDescExample example);

    int updateByExampleSelective(@Param("record") GoodsDesc record, @Param("example") GoodsDescExample example);

    int updateByExample(@Param("record") GoodsDesc record, @Param("example") GoodsDescExample example);
}