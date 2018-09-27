package com.liuerchong.service.goods;

import com.liuerchong.DataGrid;
import com.liuerchong.goods.vo.GoodsQueryVo;

/**
 * 
    * @ClassName: GoodsService
    * @Description: 商品类服务层接口
    * @author liuerchong
    * @date 2018年9月13日
    * @Project ：lec_manager_service
 */
public interface GoodsService {

	/**
	 * 
	    * @Title: getGoodList
	    * @Description: 查询商品列表
	    * @param @param goodsQueryVo
	    * @param @return    参数
	    * @return DataGrid    返回类型
	    * @throws
	 */
	public DataGrid getGoodList(GoodsQueryVo goodsQueryVo,Integer page,Integer limit );
}
