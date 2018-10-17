package com.jbit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jbit.dto.AppInfoParams;
import com.jbit.entity.AppInfo;


/**
 *
 *@author 栗子
 *@description 
 */
public interface AppInfoService {
	/**
	 * 查询所有
	 */
	public void getAll(AppInfoParams params);
	/**
	 * 删除APP基础信息以及全部版本信息
	 */
	public int deleteAppinfoVersion(int id);
	/**
	 * 根据id查询
	 */
	public AppInfo findById(@Param("id")int id);
	/**
	 * 添加app
	 */
	public int addAppInfo(AppInfo app);
}
