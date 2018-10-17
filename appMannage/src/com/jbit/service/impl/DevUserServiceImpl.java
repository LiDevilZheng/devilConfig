package com.jbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbit.dao.DevUserDao;
import com.jbit.entity.DevUser;
import com.jbit.service.DevUserService;

/**
 *
 *@author 栗子
 *@description 
 */
@Service
public class DevUserServiceImpl implements DevUserService{
@Autowired
	private DevUserDao ud;
	public DevUserDao getUd() {
		return ud;
	}
	public void setUd(DevUserDao ud) {
		this.ud = ud;
	}
	@Override
	public DevUser login(String devCode, String devPassword) {
		// TODO Auto-generated method stub
		return ud.login(devCode, devPassword);
	}

}
