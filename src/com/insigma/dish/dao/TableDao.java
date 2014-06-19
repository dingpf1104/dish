package com.insigma.dish.dao;

import java.util.List;

import com.insigma.dish.pojo.TableInfo;

public interface TableDao {
	
	public List<TableInfo> qryTablesAll();

}
