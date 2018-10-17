package com.jbit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbit.service.CategoryService;

/**
 *
 *@author 栗子
 *@description 
 */
@Controller
public class CategoryController {
@Autowired
	private CategoryService cs;
	public CategoryService getCs() {
		return cs;
	}
	public void setCs(CategoryService cs) {
		this.cs = cs;
	}
	@RequestMapping(value="category1",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@ResponseBody
	public Object getCategoryName1(){
		return cs.getCategoryName1();
	}
	@RequestMapping(value="category2",method=RequestMethod.GET)
	@ResponseBody
	public Object getCategoryName2(){
		return cs.getCategoryName2();
	}
	
	@RequestMapping(value="category2/{id}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@ResponseBody
	public Object getCategoryName2ById(@PathVariable("id")int id){
		return cs.findByparentId(id);
	}
	
	@RequestMapping(value="category3/{id}",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@ResponseBody
	public Object getCategoryName3ById(@PathVariable("id")int id){
		return cs.findByparentId(id);
	}
	
	@RequestMapping(value="category3",method=RequestMethod.GET)
	@ResponseBody
	public Object getCategoryName3(){
		return cs.getCategoryName3();
	}
}
