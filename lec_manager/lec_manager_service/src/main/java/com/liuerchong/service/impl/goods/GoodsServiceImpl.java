package com.liuerchong.service.impl.goods;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuerchong.DataGrid;
import com.liuerchong.annotation.ActionLog;
import com.liuerchong.goods.mapper.CustomerGoodsMapper;
import com.liuerchong.goods.vo.GoodsQueryVo;
import com.liuerchong.goods.vo.GoodsVo;
import com.liuerchong.service.goods.GoodsService;

@Service(value="goodsService")
public class GoodsServiceImpl implements GoodsService{

	@Resource
	CustomerGoodsMapper customerGoodsMapper ;
	
	
	@ActionLog(actionDesc="查询商品列表",actionType="goods")
	public DataGrid getGoodList(GoodsQueryVo goodsQueryVo, Integer page,
			Integer limit) {
		
		PageHelper.startPage(page,limit);
		//int i = 1/0;
		DataGrid dataGrid = new DataGrid();
		List<GoodsVo> goosList = customerGoodsMapper.selectByQuery(goodsQueryVo);
		PageInfo<GoodsVo> p = new PageInfo<GoodsVo>(goosList);
		long total = p.getTotal();
		
		dataGrid.setCode(0);
		dataGrid.setCount(total);
		dataGrid.setData(goosList);
		return dataGrid;
	}

}
