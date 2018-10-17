package com.jbit.dto;

import java.util.List;

import com.jbit.entity.AppInfo;



/**
 *
 *@author 栗子
 *@description 
 */
public class AppInfoParams {
	private String softwareName;
	private Integer status=0;
	private Integer flatformId=0;
	private Integer categoryLevel1=0;
	private Integer categoryLevel2=0;
	private Integer categoryLevel3=0;
	private Integer pageNo=1;
	private Integer pageSize=5;
	private Integer from;
	private Integer offset;
	private Integer count;
	private Integer countPage;
	private List<AppInfo> li;
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(Integer flatformId) {
		this.flatformId = flatformId;
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
	public Integer getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(Integer categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public Integer getPageNo() {
		if(pageNo>countPage){
			pageNo=countPage;
		}
		if(pageNo<1){
			pageNo=1;
		}
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		if(pageNo>0)
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		if(pageSize>0)
		this.pageSize = pageSize;
	}
	public Integer getFrom() {
		from=(pageNo-1)*pageSize;
		return from;
	}
	public void setFrom(Integer from) {
		if(from>0)
		this.from = from;
	}
	public Integer getOffset() {
		offset=pageSize;
		return offset;
	}
	public void setOffset(Integer offset) {
		if(offset>0)
		this.offset = offset;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCountPage() {
		return countPage;
	}
	public void setCountPage(Integer countPage) {
		this.countPage = countPage;
	}
	public List<AppInfo> getLi() {
		return li;
	}
	public void setLi(List<AppInfo> li) {
		this.li = li;
	}
	public AppInfoParams() {
		// TODO Auto-generated constructor stub
	}
	public AppInfoParams(String softwareName, Integer status,
			Integer flatformId, Integer categoryLevel1, Integer categoryLevel2,
			Integer categoryLevel3, Integer pageNo, Integer pageSize, Integer from, Integer offset,
			Integer count, Integer countPage, List<AppInfo> li) {
		super();
		this.softwareName = softwareName;
		this.status = status;
		this.flatformId = flatformId;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.categoryLevel3 = categoryLevel3;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.from = from;
		this.offset = offset;
		this.count = count;
		this.countPage = countPage;
		this.li = li;
	}
}
