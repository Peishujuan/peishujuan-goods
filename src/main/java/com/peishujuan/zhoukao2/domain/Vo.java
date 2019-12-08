package com.peishujuan.zhoukao2.domain;

public class Vo {

	private Double startPrice;//开始价格
	private Double endPrice;//结束价格
	
	private Integer startSales;//开始百分比
	private Integer endSales;//结束百分比
	
	private String orderName; //排序名字 .如:按照价格.按照销售百分比
	
	private String orderMethod; // desc asc

	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vo(Double startPrice, Double endPrice, Integer startSales, Integer endSales, String orderName,
			String orderMethod) {
		super();
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.startSales = startSales;
		this.endSales = endSales;
		this.orderName = orderName;
		this.orderMethod = orderMethod;
	}

	public Double getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}

	public Double getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}

	public Integer getStartSales() {
		return startSales;
	}

	public void setStartSales(Integer startSales) {
		this.startSales = startSales;
	}

	public Integer getEndSales() {
		return endSales;
	}

	public void setEndSales(Integer endSales) {
		this.endSales = endSales;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	@Override
	public String toString() {
		return "Vo [startPrice=" + startPrice + ", endPrice=" + endPrice + ", startSales=" + startSales + ", endSales="
				+ endSales + ", orderName=" + orderName + ", orderMethod=" + orderMethod + "]";
	}

	
	
	
}
