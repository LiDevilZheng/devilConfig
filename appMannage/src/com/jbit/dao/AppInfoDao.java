package com.jbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jbit.dto.AppInfoParams;
import com.jbit.entity.AppInfo;


/**
 *
 *@author 栗子
 *@description 
 */
public interface AppInfoDao {
	/**
	 * 查询总记录数
	 */
	public int getCount(AppInfoParams params);
	/**
	 * 查询所有
	 */
	public List<AppInfo> getAll(AppInfoParams params);
	/**
	 * 根据id查询
	 */
	public AppInfo findById(@Param("id")int id);
	/**
	 * 根据id删除
	 */
	public int delById(@Param("id")int id);
	/**
	 * 添加app
	 */
	public int addAppInfo(AppInfo app);
}

