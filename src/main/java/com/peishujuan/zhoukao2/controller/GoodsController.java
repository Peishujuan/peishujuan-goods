package com.peishujuan.zhoukao2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.peishujuan.zhoukao2.domain.Goods;
import com.peishujuan.zhoukao2.domain.Vo;
import com.peishujuan.zhoukao2.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m,Vo vo,@RequestParam(defaultValue = "1")int pageNum) {
		PageInfo<Goods> info = service.getGoodsList(pageNum,vo);
		m.addAttribute("vo", vo);
		m.addAttribute("info", info);
		return "list";
	}
			
}
