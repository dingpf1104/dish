package com.insigma.dish.pojo;

import java.math.BigDecimal;


public class DishInfo {
	private int dishID;
	private String name;
	private DishSort dishSort;
	private String demo;
	private BigDecimal price;
	private String picture;
	
	
	
	@Override
	public String toString() {
		return dishSort.getName() +"--"+ name + "--"
				+ price ;
	}
	public int getDishID() {
		return dishID;
	}
	public void setDishID(int dishID) {
		this.dishID = dishID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DishSort getDishSort() {
		return dishSort;
	}
	public void setDishSort(DishSort dishSort) {
		this.dishSort = dishSort;
	}
	public String getDemo() {
		return demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	
}
