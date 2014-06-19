package com.insigma.dish.dao;

import com.insigma.dish.pojo.EmployeInfo;

public interface UserDao {
	
	public EmployeInfo qryEmpByName(String name);

}
