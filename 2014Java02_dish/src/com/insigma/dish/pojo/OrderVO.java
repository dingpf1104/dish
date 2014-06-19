package com.insigma.dish.pojo;

import java.math.BigDecimal;

public class OrderVO {
	private String orderId;
	private int tableID;
	private BigDecimal totalPrice;
	private Integer employeID;
	private String name;
	public OrderVO() {
		super();
	}
	public OrderVO(String orderId, int tableID, BigDecimal totalPrice,
			Integer employeID, String name) {
		super();
		this.orderId = orderId;
		this.tableID = tableID;
		this.totalPrice = totalPrice;
		this.employeID = employeID;
		this.name = name;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getTableID() {
		return tableID;
	}
	public void setTableID(int tableID) {
		this.tableID = tableID;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getEmployeID() {
		return employeID;
	}
	public void setEmployeID(Integer employeID) {
		this.employeID = employeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "OrderVO [orderId=" + orderId + ", tableID=" + tableID
				+ ", totalPrice=" + totalPrice + ", employeID=" + employeID
				+ ", name=" + name + "]";
	}

}
