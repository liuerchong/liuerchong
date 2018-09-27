package com.liuerchong.goods.vo;

import com.liuerchong.goods.pojo.Goods;

/**
 * 
    * @ClassName: GoodsVo
    * @Description: 自定义vo类用于扩展goods类，在页面展示商品内容
    * @author liuerchong
    * @date 2018年9月13日
    * @Project ：lec_manager_pojo
 */
public class GoodsVo extends  Goods{

	
	private String gtname;

	public String getGtname() {
		return gtname;
	}

	public void setGtname(String gtname) {
		this.gtname = gtname;
	}
	
	
}
