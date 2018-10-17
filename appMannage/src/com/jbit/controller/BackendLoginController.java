package com.jbit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbit.entity.BackendUser;
import com.jbit.service.BackendUserService;

/**
 *
 *@author 栗子
 *@description 
 */
@Controller
public class BackendLoginController {
	@Autowired
	private BackendUserService bus;
	
	public BackendUserService getBus() {
		return bus;
	}
	public void setBus(BackendUserService bus) {
		this.bus = bus;
	}
	@RequestMapping("backendlogin.html")
	public String backendlogin(String userCode,String userPassword,Model model,HttpSession session){
		BackendUser bUser=bus.backendlogin(userCode, userPassword);
		if(bUser==null){
			model.addAttribute("error", "用户名密码错误！");
			return "backendlogin";
		}else{
			session.setAttribute("bUser",bUser);
			return "redirect:backend/main.jsp";
		}			
	}
}
