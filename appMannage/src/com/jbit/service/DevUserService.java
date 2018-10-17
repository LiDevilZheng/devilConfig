package com.jbit.service;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.DevUser;

/**
 *
 *@author 栗子
 *@description 
 */
public interface DevUserService {
	/**
	 * 登录验证
	 */
	public DevUser login(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
