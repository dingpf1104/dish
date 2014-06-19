package com.insigma.dish.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
	private int id;
	private String orderId;
	private Date orderTime;
	private int tableId;
	private int dishId;
	private BigDecimal fee;
	private String feeState;
	private int employeId;
	
	public OrderInfo(String orderId, Date orderTime, int tableId,
			int dishId, BigDecimal fee, String feeState, int employeId) {
		super();
		this.orderId = orderId;
		this.orderTime = orderTime;
		this.tableId = tableId;
		this.dishId = dishId;
		this.fee = fee;
		this.feeState = feeState;
		this.employeId = employeId;
	}
	public OrderInfo() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public String getFeeState() {
		return feeState;
	}
	public void setFeeState(String feeState) {
		this.feeState = feeState;
	}
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

}
