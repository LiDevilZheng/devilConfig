package com.jbit.dto;
/**
 *
 *@author 栗子
 *@description 
 */
public class CategoryDTO {
	private String category1;
	private String category2;
	private String category3;
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getCategory2() {
		return category2;
	}
	public void setCategory2(String category2) {
		this.category2 = category2;
	}
	public String getCategory3() {
		return category3;
	}
	public void setCategory3(String category3) {
		this.category3 = category3;
	}
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}
	public CategoryDTO(String category1, String category2, String category3) {
		super();
		this.category1 = category1;
		this.category2 = category2;
		this.category3 = category3;
	}
	@Override
	public String toString() {
		return "CategoryDTO [category1=" + category1 + ", category2="
				+ category2 + ", category3=" + category3 + "]";
	}
}
