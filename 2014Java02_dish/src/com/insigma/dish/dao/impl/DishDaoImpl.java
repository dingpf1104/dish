package com.insigma.dish.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.insigma.dish.dao.DishDao;
import com.insigma.dish.dao.db.DBOperator;
import com.insigma.dish.pojo.DishInfo;
import com.insigma.dish.pojo.DishSort;

public class DishDaoImpl extends DBOperator implements DishDao{
	
	@Override
	public List<DishInfo> qryDishesAll() {
		String sql = "select a.dishid,a.name,a.sortid,a.demo,a.price,b.name as sortname from" +
				" dishinfo a, dishsort b where a.sortid=b.sortid ";
		List<DishInfo> dishes = new ArrayList<DishInfo>();
		List<Map<String,Object>> list = super.select(sql);
		for (Map<String, Object> map : list) {
			DishInfo dish = new DishInfo();
			dish.setDishID((int)map.get("DishID"));
			dish.setName((String)map.get("Name"));
			dish.setDishSort(new DishSort((int)map.get("SortID"),(String)map.get("Name6")));
			dish.setDemo((String)map.get("Demo"));
			dish.setPrice((BigDecimal)map.get("Price"));
			dishes.add(dish);
		}
		return dishes;
	}

	@Override
	public List<DishSort> qryDishSortsAll() {
		String sql = "select * from dishsort";
		List<DishSort> dishSorts = new ArrayList<DishSort>();
		List<Map<String,Object>> list = super.select(sql);
		for (Map<String, Object> map : list) {
			dishSorts.add(new DishSort((int)map.get("SortID"),(String)map.get("Name")));
		}
		
		return dishSorts;
	}

}
