package com.peishujuan.zhoukao2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.peishujuan.common.utils.StreamUtil;
import com.peishujuan.common.utils.StringUtil;
import com.peishujuan.zhoukao2.domain.Goods;
import com.peishujuan.zhoukao2.service.GoodsService;
//启动spring容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceImplTest {

	@Autowired
	private GoodsService service;
	
	@Test
	public void testGetGoodsList() {
		
	}

	@Test
	public void testInsertBatch() throws Exception {
		List<Goods> list = new ArrayList<Goods>();
		
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String string : read) {
			System.out.println(string);
			Goods goods = new Goods();
			String[] s = string.split("==");
			
			boolean b = StringUtil.isNumber(s[0]);//判断是否为0
			
			goods.setId(Integer.parseInt(s[0]));
			goods.setName(s[1]);
			// 获取价格并判断是否有值
			if(StringUtil.hasText(s[2])) {
				// 去掉¥
				String price = s[2].substring(1);
				// 判断是否是数字类型
				boolean c = StringUtil.isNumber(price);
				if(c) {
					goods.setPrice(Double.valueOf(price));
				}
			}
			
			if(s.length == 4) {//数组的长度如果等于4则说明有销售比.否则没有
				if(StringUtil.hasText(s[3])) {
					//去掉%
					String sales = s[3].substring(0, s[3].lastIndexOf("%"));
					//判断是否是数字类型
					boolean c = StringUtil.isNumber(sales);
					if(c) {
						goods.setSales(Integer.valueOf(sales));
					}else {
						goods.setSales(0);
					}
				}else {
					goods.setSales(0);//如果没有销售比，则默认0
				}
				
			}
			list.add(goods);
		}	
		service.insertBatch(list);

	}

}
