package com.insigma.dish.dao.db;

import com.insigma.dish.dao.DishDao;
import com.insigma.dish.dao.OrderDao;
import com.insigma.dish.dao.TableDao;
import com.insigma.dish.dao.UserDao;
import com.insigma.dish.dao.impl.DishDaoImpl;
import com.insigma.dish.dao.impl.OrderDaoImpl;
import com.insigma.dish.dao.impl.TableDaoImpl;
import com.insigma.dish.dao.impl.UserDaoImpl;


public class DAOFactory {
	
	public static UserDao createUserDao(){
		return new UserDaoImpl();
	}
	public static TableDao createTableDao(){
		return new TableDaoImpl();
	}
	public static DishDao createDishDao(){
		return new DishDaoImpl();
	}
	public static OrderDao createOrderDao(){
		return new OrderDaoImpl();
	}
}
