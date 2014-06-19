package com.insigma.dish.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.insigma.dish.pojo.OrderInfo;
import com.insigma.dish.pojo.OrderVO;

public interface OrderDao {
	/**
	 * 订单新增
	 * @param orders
	 * @return
	 */
	public boolean addOrder(List<OrderInfo> orders);
	/**
	 * 订单查询
	 * @param orderId
	 * @param tableId
	 * @param feeState
	 * @return
	 */
	public List<OrderVO> qryOrdersByCondition(String orderId, int tableId, int feeState);
	
	public List<Map<String,Object>> yearStatis(String year);
}
