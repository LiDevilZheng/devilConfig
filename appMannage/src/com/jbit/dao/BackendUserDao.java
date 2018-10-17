package com.jbit.dao;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.BackendUser;



/**
 *
 *@author 栗子
 *@description 
 */
public interface BackendUserDao {
	/**
	 * 登录验证
	 */
	public BackendUser backendlogin(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}
