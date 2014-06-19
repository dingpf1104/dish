package com.insigma.dish.dao;

import java.util.List;

import com.insigma.dish.pojo.DishInfo;
import com.insigma.dish.pojo.DishSort;

public interface DishDao {
	/**
	 * 查询所有的菜品信息
	 * @return
	 */
	public List<DishInfo> qryDishesAll();
	/**
	 * 查询所有的菜品分类信息
	 * @return
	 */
	public List<DishSort> qryDishSortsAll();
}
