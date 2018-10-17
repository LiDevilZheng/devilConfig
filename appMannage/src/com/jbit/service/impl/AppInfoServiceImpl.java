package com.jbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbit.dao.AppInfoDao;
import com.jbit.dao.VersionDao;
import com.jbit.dto.AppInfoParams;
import com.jbit.entity.AppInfo;
import com.jbit.entity.Category;
import com.jbit.entity.Version;
import com.jbit.service.AppInfoService;

/**
 *
 *@author 栗子
 *@description 
 */
@Service
public class AppInfoServiceImpl implements AppInfoService{
@Autowired
	private AppInfoDao ad;
@Autowired
	private VersionDao vd;
	public VersionDao getVd() {
		return vd;
	}
	public void setVd(VersionDao vd) {
		this.vd = vd;
	}
	public AppInfoDao getAd() {
		return ad;
	}
	public void setAd(AppInfoDao ad) {
		this.ad = ad;
	}
	@Override
	public void getAll(AppInfoParams params) {
		// TODO Auto-generated method stub
		int count=ad.getCount(params);
		params.setCount(count);
		params.setCountPage(count%params.getPageSize()==0?(count/params.getPageSize()):(count/params.getPageSize()+1));
		params.setLi(ad.getAll(params));
	}
	@Override
	public int deleteAppinfoVersion(int id) {
		// TODO Auto-generated method stub
		//1.根据id查询对应的版本
		System.out.println(id);
		AppInfo a=ad.findById(id);
		//2.根据版本id查询对应的appId
		System.out.println(a.getVersionId());
		Version v=vd.findById(a.getVersionId());
		//3.根据appId删除对应所有版本
		System.out.println(v.getAppId());
		vd.delByappId(v.getAppId());
		//4.删除appInfo
		int result=ad.delById(id);
		return result;
	}
	@Override
	public AppInfo findById(int id) {
		// TODO Auto-generated method stub
		return ad.findById(id);
	}
	@Override
	public int addAppInfo(AppInfo app) {
		// TODO Auto-generated method stub
		return ad.addAppInfo(app);
	}
}
