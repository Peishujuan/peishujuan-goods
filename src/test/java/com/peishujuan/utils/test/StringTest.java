package com.peishujuan.utils.test;

import java.util.Calendar;

import org.junit.Test;

import com.peishujuan.common.utils.DateUtil;
import com.peishujuan.common.utils.StringUtil;

public class StringTest {

	@Test
	public void testHashTest() {
//		String src = "aaa";
		String src = "";
		boolean b = StringUtil.hasText(src);
		if(b) {
			System.out.println("有值的");
		}else {
			System.out.println("无值的");
		}
	}
	
	@Test
	public void testIsNumber() {
//		String src = "123";
		String src = "aaaa";
		boolean b = StringUtil.isNumber(src);
		if(b) {
			System.out.println("是数字");
		}else {
			System.out.println("不是数字");
		}
	}
	
	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(1997, 7, 2);
		int age = DateUtil.getAge(c.getTime());
		System.out.println(age);
	}
	
	
}
