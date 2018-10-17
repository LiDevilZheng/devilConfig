package com.jbit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbit.dao.CategoryDao;
import com.jbit.dto.CategoryDTO;
import com.jbit.entity.Category;
import com.jbit.service.CategoryService;

/**
 *
 *@author 栗子
 *@description 
 */
@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
private CategoryDao cd;
	public CategoryDao getCd() {
		return cd;
	}
	public void setCd(CategoryDao cd) {
		this.cd = cd;
	}
	@Override
	public CategoryDTO findById(int id1, int id2, int id3) {
		// TODO Auto-generated method stub
		CategoryDTO dto=new CategoryDTO(cd.findById(id1), cd.findById(id2), cd.findById(id3));		
		return dto;
	}
	@Override
	public List<Category> getCategoryName1() {
		// TODO Auto-generated method stub
		return cd.getCategoryName1();
	}
	@Override
	public List<Category> getCategoryName2() {
		// TODO Auto-generated method stub
		List<Category> li1=cd.getCategoryName1();
		List<Category> li2=new ArrayList<Category>();
		for(Category c:li1){
			List<Category> temp=cd.findByparentId(c.getId());
			li2.addAll(temp);
		}
		return li2;
	}
	@Override
	public List<Category> getCategoryName3() {
		// TODO Auto-generated method stub
		List<Category> li2=this.getCategoryName2();
		List<Category> li3=new ArrayList<Category>();
		for(Category c:li2){
			List<Category> temp=cd.findByparentId(c.getId());
			li3.addAll(temp);
		}
		return li3;
	}
	@Override
	public List<Category> findByparentId(int parentId) {
		// TODO Auto-generated method stub
		return cd.findByparentId(parentId);
	}	
}
