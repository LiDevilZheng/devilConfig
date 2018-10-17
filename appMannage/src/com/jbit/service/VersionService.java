package com.jbit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.Version;

/**
 *
 *@author 栗子
 *@description 
 */
public interface VersionService {
	/**
	 * 根据id查询软件所有的历史版本信息
	 */
	public List<Version> getAllVersion(@Param("appId")int appId);
	/**
	 * 根据id查询软件信息
	 */
	public Version findByVersion(@Param("appId")int appId);
	/**
	 * 添加新版本
	 */
	public int addVersion(Version v);
	/**
	 * 修改最新版本信息
	 */
	public int updateVersion(Version v);
}
