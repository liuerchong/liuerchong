package com.liuerchong.goods.mapper;

import java.util.List;

import com.liuerchong.goods.vo.GoodsQueryVo;
import com.liuerchong.goods.vo.GoodsVo;

public interface CustomerGoodsMapper {

	/**
	 * 
	    * @Title: selectByQuery
	    * @Description: 通过条件查询商品列表
	    * @param @param goodsQueryVo
	    * @param @return    参数
	    * @return List<GoodsVo>    返回类型
	    * @throws
	 */
	List<GoodsVo> selectByQuery(GoodsQueryVo goodsQueryVo);
	
	int countByQuery (GoodsQueryVo goodsQueryVo);
}
