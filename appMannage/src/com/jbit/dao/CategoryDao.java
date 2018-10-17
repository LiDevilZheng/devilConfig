package com.jbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.Category;

/**
 *
 *@author 栗子
 *@description 
 */
public interface CategoryDao {
	/**
	 * 查询分类
	 */
	public String findById(@Param("id")int id);
	/**
	 * 查询所有的一级分类
	 */
	public List<Category> getCategoryName1();
	/**
	 * 查询所有的二级级分类
	 */
	public List<Category> getCategoryName2();
	/**
	 * 查询所有的三级分类
	 */
	public List<Category> getCategoryName3();
	/**
	 * 根据parentID查询分类
	 */
	public List<Category> findByparentId(@Param("parentId")int parentId);
}
