package com.insigma.dish.pojo;

public class DishSort {
	private int sortId;
	private String name;
	
	
	public DishSort(int sortId, String name) {
		super();
		this.sortId = sortId;
		this.name = name;
	}

	public int getSortId() {
		return sortId;
	}
	
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return sortId + "-" + name;
	}

}
