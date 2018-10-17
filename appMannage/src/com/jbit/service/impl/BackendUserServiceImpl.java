package com.jbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbit.dao.BackendUserDao;
import com.jbit.entity.BackendUser;
import com.jbit.service.BackendUserService;

/**
 *
 *@author 栗子
 *@description 
 */
@Service
public class BackendUserServiceImpl implements BackendUserService{
@Autowired
	private BackendUserDao bud;
	public BackendUserDao getBud() {
		return bud;
	}
	public void setBud(BackendUserDao bud) {
		this.bud = bud;
	}
	@Override
	public BackendUser backendlogin(String userCode, String userPassword) {
		// TODO Auto-generated method stub
		return bud.backendlogin(userCode, userPassword);
	}

}
