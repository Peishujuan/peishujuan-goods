package com.peishujuan.zhoukao2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.peishujuan.zhoukao2.dao.GoodsMapper;
import com.peishujuan.zhoukao2.domain.Goods;
import com.peishujuan.zhoukao2.domain.Vo;
import com.peishujuan.zhoukao2.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper mapper;
	
	@Override
	public PageInfo<Goods> getGoodsList(int pageNum, Vo vo) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> goods = mapper.getGoodsList(vo);
		PageInfo<Goods> info = new PageInfo<Goods>(goods);
		return info;  
	}

	@Override
	public int insertBatch(List<Goods> list) {
		
		return mapper.insertBatch(list);
	}
	
	

}
