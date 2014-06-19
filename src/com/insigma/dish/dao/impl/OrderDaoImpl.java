package com.insigma.dish.dao.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.insigma.dish.dao.OrderDao;
import com.insigma.dish.dao.db.DBManager;
import com.insigma.dish.dao.db.DBOperator;
import com.insigma.dish.pojo.OrderInfo;
import com.insigma.dish.pojo.OrderVO;
import com.insigma.dish.util.Constants;

public class OrderDaoImpl extends DBOperator implements OrderDao {
	/**
	 * 订单新增插入
	 */
	@Override
	public boolean addOrder(List<OrderInfo> orders) {
		String sql ="insert into orderinfo(orderId,orderTime,tableId,dishId,fee,feeState,employeId) values(?,?,?,?,?,?,?);";
		String tableSql ="update tableinfo set tablestate='"+Constants.TABLESTATE_1+"' where tableid="+orders.get(0).getTableId()+";";
		Connection conn = DBManager.getConnection();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		PreparedStatement prepareStatement = null;
		boolean flag = false;
		try {
			prepareStatement = conn.prepareStatement(sql);
			//批量插入订单表
			for (OrderInfo order : orders) {
				prepareStatement.setString(1, order.getOrderId());
				prepareStatement.setTimestamp(2, new java.sql.Timestamp(order.getOrderTime().getTime()));
				prepareStatement.setInt(3, order.getTableId());
				prepareStatement.setInt(4, order.getDishId());
				prepareStatement.setBigDecimal(5, order.getFee());
				prepareStatement.setString(6,order.getFeeState());
				prepareStatement.setInt(7, order.getEmployeId());
				prepareStatement.addBatch();
				
				/*boolean isSuc =  prepareStatement.executeUpdate()>0?true:false;
				if(!isSuc){
					throw new SQLException("订单循环插入失败");
				}*/
			}
			//批量修改tableinfo表
			prepareStatement.addBatch(tableSql);
			//批量执行
			int[] rows = prepareStatement.executeBatch();
			//循环判断 批量修改是否每条都成功；其中有一条不成功，那么所有此次数据库修改将回滚
			for (int i : rows) {
				boolean isSuc =  i>0?true:false;
				if(!isSuc){
					throw new SQLException("订单插入失败");
				}
			}
			conn.commit();
			flag = true;
		} catch (SQLException e) {
			//事务回滚
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			flag = false;
			e.printStackTrace();
		}finally{
			DBManager.closeBDResourse(conn, prepareStatement, null);
		}
		
		return flag;
	}

	@Override
	public List<OrderVO> qryOrdersByCondition(String orderId, int tableId,
			int feeState) {
		
		String sql = "select a.OrderID,a.TableID,sum(a.Fee) as sum,c.EmployeID,c.`Name` from orderinfo a, employeinfo c where a.EmployeID = c.EmployeID " +
				" and a.FeeState=" + feeState;
		if(!"".equals(orderId)){
			sql += " and a.OrderID='" + orderId + "'";
		}
		if(tableId != 0){
			sql += " and a.TableId=" + tableId;
		}
		
		sql += " GROUP BY a.OrderID";
		List<Map<String,Object>> list = super.select(sql);
		List<OrderVO> orderVOs =new ArrayList<OrderVO>();
		
		for (Map<String, Object> map : list) {
			OrderVO ovo = new OrderVO((String)map.get("OrderID"),
					(int)map.get("TableID"),
					(BigDecimal)map.get("sum"),
					(Integer)map.get("EmployeID"),
					(String)map.get("Name"));
			orderVOs.add(ovo);
		}
		
		return orderVOs;
	}
	
	
	public static void main(String[] args) {
		List<OrderVO> orderVOs = new OrderDaoImpl().qryOrdersByCondition("", 0, 0);
		for (OrderVO orderVO : orderVOs) {
			System.out.println(orderVO);
		}
	}

	@Override
	public List<Map<String,Object>> yearStatis(String year) {
		String sql = "SELECT "+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '01' THEN fee ELSE 0 END) as month1,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '02' THEN fee ELSE 0 END) as month2,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '03' THEN fee ELSE 0 END) as month3,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '04' THEN fee ELSE 0 END) as month4,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '05' THEN fee ELSE 0 END) as month5,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '06' THEN fee ELSE 0 END) as month6,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '07' THEN fee ELSE 0 END) as month7,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '08' THEN fee ELSE 0 END) as month8,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '09' THEN fee ELSE 0 END) as month9,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '10' THEN fee ELSE 0 END) as month10,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '11' THEN fee ELSE 0 END) as month11,"+
					" sum(CASE DATE_FORMAT(OrderTime,'%m') WHEN '12' THEN fee ELSE 0 END) as month12"+
					" from orderinfo "+
					" WHERE DATE_FORMAT(OrderTime,'%y')='"+year.substring(2)+"'";
		List<Map<String,Object>> map = super.select(sql);
		
		return map;
	}
}
