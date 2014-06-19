package com.insigma.dish.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库的管理类  ： 连接和关闭
 * @author dingpf
 *
 */
public class DBManager {
	//定义数据库url信息
	private static final String url = "jdbc:mysql://localhost:3306/dish";
	private static final String user = "root";
	private static final String password = "eeee";
	/**
	 * 连接管理
	 * @return
	 */
	public static Connection getConnection(){
		Connection connection = null;
		//1、注册驱动程序  加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2、建立一个数据库连接
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("数据库连接失败");
			e.printStackTrace();
		}
		
		return connection;
	}
	/**
	 * 数据库关闭资源
	 * @param connection
	 * @param statement
	 * @param resultSet
	 */
	public static void closeBDResourse(Connection connection, Statement statement,ResultSet resultSet){
		try {
			if(resultSet!=null){
				resultSet.close();
			}
			if(statement!=null){
				statement.close();
			}
			if(connection!=null){
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭数据库连接失败");
			e.printStackTrace();
		}
	}

}
