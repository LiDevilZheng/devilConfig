package com.jbit.dto;

import com.jbit.entity.AppInfo;


/**
 *
 *@author 栗子
 *@description 
 */
public class AppInfoDTO {
	private AppInfo appinfo;
	private CategoryDTO categoryDTO;
	public AppInfo getAppinfo() {
		return appinfo;
	}
	public void setAppinfo(AppInfo appinfo) {
		this.appinfo = appinfo;
	}
	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}
	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}
	public AppInfoDTO() {
		// TODO Auto-generated constructor stub
	}
	public AppInfoDTO(AppInfo appinfo, CategoryDTO categoryDTO) {
		super();
		this.appinfo = appinfo;
		this.categoryDTO = categoryDTO;
	}
	
}
