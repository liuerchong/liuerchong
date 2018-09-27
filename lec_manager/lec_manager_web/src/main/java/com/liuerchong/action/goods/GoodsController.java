package com.liuerchong.action.goods;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuerchong.DataGrid;
import com.liuerchong.annotation.ActionLog;
import com.liuerchong.goods.vo.GoodsQueryVo;
import com.liuerchong.goods.vo.GoodsVo;
import com.liuerchong.service.goods.GoodsService;

@Controller
public class GoodsController {

	@Resource
	GoodsService goodsService;
	
	@RequestMapping("/toGoodsList")
	public String  toGoodsList(){
		
		return "/goods/goodsList";
		//return "/goods/addGoods";
	}
	@ResponseBody
	@RequestMapping("/getGoodsList")
	
	public DataGrid getGoodsList(GoodsQueryVo goodsQueryVo ,Integer page,Integer limit,String name){
		if (null==goodsQueryVo) {
			
			goodsQueryVo = new GoodsQueryVo();
		}
		GoodsVo goodsVo = new GoodsVo();
		if(StringUtils.isBlank(name)){
			
			goodsVo.setName(name);
		}
		goodsQueryVo.setGoodsVo(goodsVo);
		page = (null==page)?1:page;
		limit = (null==limit)?10:limit;
		DataGrid goodList = goodsService.getGoodList(goodsQueryVo, page, limit);
		
		return goodList;
	}
	
	/**
	 * 
	    * @Title: toAddGoods
	    * @Description: 跳转到添加商品页面
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	
	@RequestMapping("/toAddGoods")
	public String toAddGoods(){
		
		return "/goods/addGoods";
	}
	
	
}
