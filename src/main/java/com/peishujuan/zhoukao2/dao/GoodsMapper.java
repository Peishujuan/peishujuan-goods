package com.peishujuan.zhoukao2.dao;

import java.util.List;

import com.peishujuan.zhoukao2.domain.Goods;
import com.peishujuan.zhoukao2.domain.Vo;

public interface GoodsMapper {

	List<Goods> getGoodsList(Vo vo);

	int insertBatch(List<Goods> list);
}
