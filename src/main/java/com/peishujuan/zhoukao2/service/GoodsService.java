package com.peishujuan.zhoukao2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.peishujuan.zhoukao2.domain.Goods;
import com.peishujuan.zhoukao2.domain.Vo;

public interface GoodsService {

	PageInfo<Goods> getGoodsList(int pageNum, Vo vo);

	int insertBatch(List<Goods> list);
}
