package com.jbit.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.jbit.dto.AppInfoDTO;
import com.jbit.dto.AppInfoParams;
import com.jbit.dto.CategoryDTO;
import com.jbit.entity.AppInfo;
import com.jbit.entity.DevUser;
import com.jbit.service.AppInfoService;
import com.jbit.service.CategoryService;

/**
 *
 *@author 栗子
 *@description 
 */
@Controller
public class AppInfoController {
@Autowired
	private AppInfoService as;
@Autowired
	private CategoryService cs;
	private List<String> allowedType=Arrays.asList("jpg","png","gif");
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
	@RequestMapping("appinfoadd.html")
	public String addAppInfo(@Valid AppInfo app,BindingResult result,Model model,MultipartFile logoPicPath,HttpSession session){
		String path=session.getServletContext().getRealPath("/pic");
		File file=new File(path);
		if(!file.exists()){
			file.mkdir();
		}
		if(!logoPicPath.isEmpty()){
			String name=logoPicPath.getOriginalFilename();
			String type=name.substring(name.lastIndexOf(".")+1);
			if(!allowedType.contains(type)){
				model.addAttribute("file_error", "您上传的图片格式不正确！");
				return "developer/appinfoadd";
			}else{
				String newName=UUID.randomUUID().toString().replace("-", "")+"."+type;
				File upload=new File(path+"/"+newName);
				
				try {
					logoPicPath.transferTo(upload);//上传文件写到服务器上指定的文件。
					app.setLogoLocPath("D:/soft/apache-tomcat-7.0.41/webapps/AppInfoSystem/statics/uploadfiles/"+newName);
					app.setLogoPicPath("/appMannage/statics/uploadfiles/"+newName);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				DevUser user=(DevUser)session.getAttribute("devUser");
				app.setDevId(user.getId());
				app.setCreatedBy(user.getId());
				app.setCreationDate(new Timestamp(System.currentTimeMillis()));
				as.addAppInfo(app);
				return "redirect:appinfolist.html";
			}		
		}else{
			model.addAttribute("file_error", "您还没有选择图片！");
			return "developer/appinfoadd";
		}
	}
	@RequestMapping("appinfoview.html")
	public String findById(int id,Model model){		
		model.addAttribute("appinfo", as.findById(id));
		return "developer/appinfoview";
	}
	@RequestMapping(value="appinfos/{id}",method=RequestMethod.GET)
	public Object delApp(@PathVariable("id")int id){
		int result=as.deleteAppinfoVersion(id);
		if(result>0){
			return 1;
		}else{
			return -1;
		}
	}
	@RequestMapping("appinfolist.html")
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
		return "developer/appinfolist";
	}
}
