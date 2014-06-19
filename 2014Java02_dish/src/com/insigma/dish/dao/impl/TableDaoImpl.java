package com.insigma.dish.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.insigma.dish.dao.TableDao;
import com.insigma.dish.dao.db.DBOperator;
import com.insigma.dish.pojo.TableInfo;

public class TableDaoImpl extends DBOperator implements TableDao {

	@Override
	public List<TableInfo> qryTablesAll() {
		String sql = "select * from tableinfo";
		List<TableInfo> tables = new ArrayList<TableInfo>();
		List<Map<String,Object>> list = super.select(sql);
		for (Map<String, Object> map : list) {
			tables.add(new TableInfo((int)map.get("TableID"),(int)map.get("TableState")));
		}
		
		return tables;
	}

}
