package com.insigma.dish.dao.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库访问操作类
 * @author dingpf
 *
 */
public class DBOperator {
	/**
	 * sql 完整的
	 * @param sql
	 * @return
	 */
	public boolean executeUpdate(String sql){
		Connection conn = DBManager.getConnection();
		Statement statement = null;
		boolean flag = false;
		try {
			statement = conn.createStatement();
			flag = statement.executeUpdate(sql)>0?true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBManager.closeBDResourse(conn, statement, null);
		}
		return flag;
	}
	/**
	 * sql 完整的
	 * @param sql
	 * @return
	 */
	public List<Map<String,Object>> select(String sql){
		Connection conn = DBManager.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				ResultSetMetaData rsmd = resultSet.getMetaData();
				//把查询到的每一行 数据  放到 Map中   一行一个Map
				Map<String,Object> dataMap = new HashMap<String,Object>();
				for(int i=1; i<=rsmd.getColumnCount(); i++){
					if(dataMap.get(rsmd.getColumnName(i))==null){
						dataMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
					}else{
						dataMap.put(rsmd.getColumnName(i)+i, resultSet.getObject(i));
					}
				}
				//把每一行放到 list中
				list.add(dataMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBManager.closeBDResourse(conn, statement, resultSet);
		}
		return list;
	}
	/**
	 * PreparedStatement 
	 * @param pStatement
	 * @param conn
	 * @return
	 */
	public boolean pExecuteUpdate(PreparedStatement pStatement,Connection conn){
		boolean flag = false;
		try {
			flag = pStatement.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBManager.closeBDResourse(conn, pStatement, null);
		}
		return flag;
	}
	/**
	 * PreparedStatement 
	 * @param pStatement
	 * @param conn
	 * @return
	 */
	public List<Map<String,Object>> select(PreparedStatement pStatement,Connection conn){
		ResultSet resultSet = null;
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			resultSet = pStatement.executeQuery();
			while(resultSet.next()){
				ResultSetMetaData rsmd = resultSet.getMetaData();
				//把查询到的每一行 数据  放到 Map中   一行一个Map
				Map<String,Object> dataMap = new HashMap<String,Object>();
				for(int i=1; i<=rsmd.getColumnCount(); i++){
					if(dataMap.get(rsmd.getColumnName(i))==null){
						dataMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
					}else{
						dataMap.put(rsmd.getColumnName(i)+i, resultSet.getObject(i));
					}
					
				}
				//把每一行放到 list中
				list.add(dataMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBManager.closeBDResourse(conn, pStatement, resultSet);
		}
		return list;
	}

}
