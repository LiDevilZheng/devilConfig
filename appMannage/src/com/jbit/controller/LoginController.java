package com.jbit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jbit.entity.BackendUser;
import com.jbit.entity.DevUser;
import com.jbit.service.BackendUserService;
import com.jbit.service.DevUserService;

/**
 *
 *@author 栗子
 *@description 
 */
@Controller
public class LoginController {
@Autowired
	private DevUserService us;
	public DevUserService getUs() {
		return us;
	}	
	public void setUs(DevUserService us) {
		this.us = us;
	}
	@RequestMapping("devlogin.html")
	public String login(String devCode,String devPassword,Model model,HttpSession session){
		DevUser u=us.login(devCode, devPassword);
		if(u==null){
			model.addAttribute("error", "用户名密码错误！");
			return "devlogin";
		}else{
			session.setAttribute("devUser", u);
			return "redirect:developer/main.jsp";
		}			
	}
}
