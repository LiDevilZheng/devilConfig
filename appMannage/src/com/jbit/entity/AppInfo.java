package com.jbit.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 *@author 栗子
 *@description 
 */
public class AppInfo {
	private Integer id;
	private String softwareName;
	private String APKName;
	private String supportROM;
	private String interfaceLanguage;
	private Double softwareSize;
	private Date updateDate;
	private Integer devId;
	private String appInfo;
	private Integer status;
	private Timestamp onSaleDate;
	private Timestamp offSaleDate;
	private Integer flatformId;
	private Integer categoryLevel3;	
	private Integer downloads;
	private Integer createdBy;
	private Timestamp creationDate;
	private Integer categoryLevel1;
	private Integer categoryLevel2;	
	private String logoPicPath;
	private String logoLocPath;
	private Integer versionId;
	private String versionNo;
	private String categoryName1;
	private String categoryName2;
	private String categoryName3;
	public String getCategoryName1() {
		return categoryName1;
	}
	public void setCategoryName1(String categoryName1) {
		this.categoryName1 = categoryName1;
	}
	public String getCategoryName2() {
		return categoryName2;
	}
	public void setCategoryName2(String categoryName2) {
		this.categoryName2 = categoryName2;
	}
	public String getCategoryName3() {
		return categoryName3;
	}
	public void setCategoryName3(String categoryName3) {
		this.categoryName3 = categoryName3;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public Double getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(Double softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getDevId() {
		return devId;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Timestamp getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Timestamp onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Timestamp getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Timestamp offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public Integer getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(Integer flatformId) {
		this.flatformId = flatformId;
	}
	public Integer getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(Integer categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public Integer getDownloads() {
		return downloads;
	}
	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(Integer categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public Integer getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(Integer categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public AppInfo() {
		// TODO Auto-generated constructor stub
	}
	public AppInfo(Integer id, String softwareName, String aPKName,
			String supportROM, String interfaceLanguage, Double softwareSize,
			Date updateDate, Integer devId, String appInfo, Integer status,
			Timestamp onSaleDate, Timestamp offSaleDate, Integer flatformId,
			Integer categoryLevel3, Integer downloads, Integer createdBy,
			Timestamp creationDate, Integer categoryLevel1,
			Integer categoryLevel2, String logoPicPath, String logoLocPath,
			Integer versionId, String versionNo) {
		super();
		this.id = id;
		this.softwareName = softwareName;
		APKName = aPKName;
		this.supportROM = supportROM;
		this.interfaceLanguage = interfaceLanguage;
		this.softwareSize = softwareSize;
		this.updateDate = updateDate;
		this.devId = devId;
		this.appInfo = appInfo;
		this.status = status;
		this.onSaleDate = onSaleDate;
		this.offSaleDate = offSaleDate;
		this.flatformId = flatformId;
		this.categoryLevel3 = categoryLevel3;
		this.downloads = downloads;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.logoPicPath = logoPicPath;
		this.logoLocPath = logoLocPath;
		this.versionId = versionId;
		this.versionNo = versionNo;
	}
	public AppInfo(Integer id, String softwareName, String aPKName,
			String supportROM, String interfaceLanguage, Double softwareSize,
			Date updateDate, Integer devId, String appInfo, Integer status,
			Timestamp onSaleDate, Timestamp offSaleDate, Integer flatformId,
			Integer categoryLevel3, Integer downloads, Integer createdBy,
			Timestamp creationDate, Integer categoryLevel1,
			Integer categoryLevel2, String logoPicPath, String logoLocPath,
			Integer versionId, String versionNo, String categoryName1,
			String categoryName2, String categoryName3) {
		super();
		this.id = id;
		this.softwareName = softwareName;
		APKName = aPKName;
		this.supportROM = supportROM;
		this.interfaceLanguage = interfaceLanguage;
		this.softwareSize = softwareSize;
		this.updateDate = updateDate;
		this.devId = devId;
		this.appInfo = appInfo;
		this.status = status;
		this.onSaleDate = onSaleDate;
		this.offSaleDate = offSaleDate;
		this.flatformId = flatformId;
		this.categoryLevel3 = categoryLevel3;
		this.downloads = downloads;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.logoPicPath = logoPicPath;
		this.logoLocPath = logoLocPath;
		this.versionId = versionId;
		this.versionNo = versionNo;
		this.categoryName1 = categoryName1;
		this.categoryName2 = categoryName2;
		this.categoryName3 = categoryName3;
	}
	
}
