package com.insigma.dish.dao.impl;

import java.util.List;
import java.util.Map;

import com.insigma.dish.dao.UserDao;
import com.insigma.dish.dao.db.DBOperator;
import com.insigma.dish.pojo.EmployeInfo;

public class UserDaoImpl extends DBOperator implements UserDao {

	@Override
	/**
	 * 根据用户名查询 雇员对象
	 */
	public EmployeInfo qryEmpByName(String name) {
		String sql = "select * from employeinfo where name='" + name + "'";
		List<Map<String,Object>> list = super.select(sql);
		EmployeInfo employe = null;
		if(list!=null && list.size()==1){
			Map<String,Object> map = list.get(0);
			employe = new EmployeInfo((Integer)map.get("EmployeID"),
					(String)map.get("Name"),(int)map.get("Age"),
					(String)map.get("pwd"),(Integer)map.get("PurviewID"));
		}
		return employe;
	}

}
