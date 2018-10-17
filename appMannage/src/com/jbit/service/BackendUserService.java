package com.jbit.service;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.BackendUser;


/**
 *
 *@author 栗子
 *@description 
 */
public interface BackendUserService {
	/**
	 * 登录验证
	 */
	public BackendUser backendlogin(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}
