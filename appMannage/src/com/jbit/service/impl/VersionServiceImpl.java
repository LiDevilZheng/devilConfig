package com.jbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbit.dao.VersionDao;
import com.jbit.entity.Version;
import com.jbit.service.VersionService;

/**
 *
 *@author 栗子
 *@description 
 */
@Service
public class VersionServiceImpl implements VersionService{
@Autowired
	private VersionDao vd;
	public VersionDao getVd() {
		return vd;
	}
	public void setVd(VersionDao vd) {
		this.vd = vd;
	}
	@Override
	public List<Version> getAllVersion(int appId) {
		// TODO Auto-generated method stub
		return vd.getAllVersion(appId);
	}
	@Override
	public int addVersion(Version v) {
		// TODO Auto-generated method stub
		return vd.addVersion(v);
	}
	@Override
	public Version findByVersion(int appId) {
		// TODO Auto-generated method stub
		return vd.findByVersion(appId);
	}
	@Override
	public int updateVersion(Version v) {
		// TODO Auto-generated method stub
		return vd.updateVersion(v);
	}

}
