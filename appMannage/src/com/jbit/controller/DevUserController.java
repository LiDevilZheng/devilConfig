package com.jbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jbit.service.DevUserService;

/**
 *
 *@author 栗子
 *@description 
 */
@Controller
public class DevUserController {
@Autowired
	private DevUserService us;
	public DevUserService getUs() {
		return us;
	}	
	public void setUs(DevUserService us) {
		this.us = us;
	}
	
}
