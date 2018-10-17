package com.jbit.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
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
import org.springframework.web.multipart.MultipartFile;

import com.jbit.entity.DevUser;
import com.jbit.entity.Version;
import com.jbit.service.VersionService;
/**
 *
 *@author 栗子 
 *@description 
 */
@Controller
public class VersionController {
@Autowired 
	private VersionService vs;
	private List<String> allowedType=Arrays.asList("apk");
	public VersionService getVs() {
		return vs;
	}
	public void setVs(VersionService vs) {
		this.vs = vs;
	}	
	@RequestMapping("appversionmodifysave.html")
	public String modifyVersion(@Valid Version v,BindingResult result,Model model,HttpSession session,MultipartFile downloadLink){
		String path=session.getServletContext().getRealPath("/apk");//取的是Servlet容器对象，相当于tomcat容器。getRealPath("/") 获取实际路径，“/”指代项目根目录，所以代码返回的是项目在容器中的实际发布运行的根路径
		File f=new File(path);
		if(!f.exists()){
			f.mkdir();
		}
		if(!downloadLink.isEmpty()){
			String name=downloadLink.getOriginalFilename();
			v.setDownloadLink("/AppInfoSystem/statics/uploadfiles/"+name);
			String type=name.substring(name.lastIndexOf(".")+1);
			if(!allowedType.contains(type)){
				model.addAttribute("version", vs.getAllVersion(v.getAppId()));
				model.addAttribute("fileUploadError", "您上传的文件格式不正确！");
				return "developer/appversionmodify";
			}else{
				//String newName=UUID.randomUUID().toString().replace("-", "");
				File upload=new File(path+"/"+name);
				try {
					downloadLink.transferTo(upload);//上传文件写到服务器上指定的文件。
					v.setApkFileName(name);
					v.setApkLocPath(path+"/"+name);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				DevUser dUser=(DevUser)session.getAttribute("devUser");
				v.setModifyBy(dUser.getId());
				Timestamp t=new Timestamp(System.currentTimeMillis());
				v.setModifyDate(t);
			}
		}
		int r=vs.updateVersion(v);
		if(r>0){
			return "redirect:appinfolist.html";
		}else{
			model.addAttribute("version_error", "版本号已经存在");
			return "developer/appversionmodify";
		}
	}
	@RequestMapping("appversionmodify.html")
	public String updateVersions(int appId,Model model){
		model.addAttribute("appId", appId);
		model.addAttribute("version", vs.getAllVersion(appId));
		model.addAttribute("v",vs.findByVersion(appId));
		return "developer/appversionmodify";
	}
	@RequestMapping("appversionadd.html")
	public String findVersions(int appId,Model model){
		model.addAttribute("appId", appId);
		model.addAttribute("version", vs.getAllVersion(appId));
		return "developer/appversionadd";
	}
	@RequestMapping("addversionsave.html")
	public String addVersion(@Valid Version v, BindingResult result,Model model,HttpSession session,MultipartFile downloadLink){
		String path=session.getServletContext().getRealPath("/apk");//取的是Servlet容器对象，相当于tomcat容器。getRealPath("/") 获取实际路径，“/”指代项目根目录，所以代码返回的是项目在容器中的实际发布运行的根路径
		File f=new File(path);
		if(!f.exists()){
			f.mkdir();
		}
		if(!downloadLink.isEmpty()){
			String name=downloadLink.getOriginalFilename();
			v.setDownloadLink("/AppInfoSystem/statics/uploadfiles/"+name);
			String type=name.substring(name.lastIndexOf(".")+1);
			if(!allowedType.contains(type)){
				System.out.println(type);
				model.addAttribute("version", vs.getAllVersion(v.getAppId()));
				model.addAttribute("fileUploadError", "您上传的文件格式不正确！");
				return "developer/appversionadd";
			}else{
				//String newName=UUID.randomUUID().toString().replace("-", "");
				File upload=new File(path+"/"+name);
				try {
					downloadLink.transferTo(upload);//上传文件写到服务器上指定的文件。
					v.setApkFileName(name);
					v.setApkLocPath(path+"/"+name);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				DevUser dUser=(DevUser)session.getAttribute("devUser");
				v.setCreatedBy(dUser.getId());
				Timestamp t=new Timestamp(System.currentTimeMillis());
				v.setCreationDate(t);
			}
		}
		int r=vs.addVersion(v);
		if(r>0){
			return "redirect:appinfolist.html";
		}else{
			model.addAttribute("version_error", "版本号已经存在");
			return "developer/appversionadd";
		}
	}
}
