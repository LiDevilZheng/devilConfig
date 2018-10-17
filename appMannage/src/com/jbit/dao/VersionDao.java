package com.jbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.Version;

/**
 *
 *@author 栗子
 *@description 
 */
public interface VersionDao {
	/**
	 * 根据appId查询软件所有的历史版本信息
	 */
	public List<Version> getAllVersion(@Param("appId")int appId);
	/**
	 * 根据appId查询软件信息
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
	/**
	 * 根据id查询信息
	 */
	public Version findById(@Param("id")int id);
	/**
	 * 根据appId删除所有对应信息
	 */
	public int delByappId(@Param("appId")int appId);
}
