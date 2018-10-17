package com.jbit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbit.dto.AppInfoDTO;
import com.jbit.dto.AppInfoParams;
import com.jbit.dto.CategoryDTO;
import com.jbit.entity.AppInfo;
import com.jbit.service.AppInfoService;
import com.jbit.service.CategoryService;


/**
 *
 *@author 栗子
 *@description 
 */
@Controller
public class AppListController {
@Autowired
	private AppInfoService as;
@Autowired
	private CategoryService cs;
	public AppInfoService getAs() {
		return as;
	}
	public void setAs(AppInfoService as) {
		this.as = as;
	}
	public CategoryService getCs() {
		return cs;
	}
	public void setCs(CategoryService cs) {
		this.cs = cs;
	}
	@RequestMapping("appcheck.html")
	public String checkApp(int id,Model model){
		model.addAttribute("appinfo", as.findById(id));
		return "backend/appcheck";
	}
	@RequestMapping("applist.html")
	public String getAll(AppInfoParams params,Model model){
		List<AppInfoDTO> list=new ArrayList<AppInfoDTO>();
		as.getAll(params);
		List<AppInfo> li=params.getLi();
		for(AppInfo a:li){
			CategoryDTO	cdto=new CategoryDTO();		
			cdto=cs.findById(a.getCategoryLevel1(), a.getCategoryLevel2(), a.getCategoryLevel3());
			AppInfoDTO ad=new AppInfoDTO();
			ad.setAppinfo(a);
			ad.setCategoryDTO(cdto);
			list.add(ad);
		}
		model.addAttribute("params", params);
		model.addAttribute("list", list);
		return "backend/applist";
	}
}
