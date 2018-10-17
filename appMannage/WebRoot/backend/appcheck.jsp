<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	
</script>
<div class="clearfix"></div>
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
      <div class="x_title">
        <h2>查看并审核APP信息 <i class="fa fa-user"></i>张三</small></h2>
             <div class="clearfix"></div>
      </div>
      <div class="x_title">
            <h2>APP基础信息</h2>
          <div class="clearfix"></div>
      </div>
      <div class="x_content1">
        <form class="form-horizontal form-label-left" action="#" method="post">
        
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">软件名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input class="form-control col-md-7 col-xs-12" value="${appinfo.softwareName }" 
              type="text" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">APK名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control col-md-7 col-xs-12" 
              value="${appinfo.APKName }" readonly="readonly">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">支持ROM <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input class="form-control col-md-7 col-xs-12" 
              	value="${appinfo.supportROM }" type="text" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">界面语言 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input class="form-control col-md-7 col-xs-12" readonly="readonly"
              	value="${appinfo.interfaceLanguage }" type="text">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">软件大小 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" value="${appinfo.softwareSize }"
              class="form-control col-md-7 col-xs-12" readonly="readonly">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">下载次数 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" value="${appinfo.downloads }"
               class="form-control col-md-7 col-xs-12" readonly="readonly">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">所属平台 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control col-md-7 col-xs-12" 
              	value="<c:if test='${appinfo.flatformId==1 }'>手机</c:if>
						<c:if test='${appinfo.flatformId==2 }'>平板</c:if>
						<c:if test='${appinfo.flatformId==3}'>通用</c:if>" 
					readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="select">所属分类 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control col-md-7 col-xs-12" 
              	value="${appinfo.categoryName1 } -> ${appinfo.categoryName2 } -> ${appinfo.categoryName3}" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">APP状态 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
            	<input type="text" class="form-control col-md-7 col-xs-12" 
              	value="
				<c:if test='${appinfo.status==1}'>待审核</c:if>
				<c:if test='${appinfo.status==2}'>审核通过</c:if>
				<c:if test='${appinfo.status==3}'>审核不通过</c:if>
				<c:if test='${appinfo.status==4}'>已上架</c:if>
				<c:if test='${appinfo.status==5}'>已下架</c:if>
				" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">应用简介 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea class="form-control col-md-7 col-xs-12" readonly="readonly">${appinfo.appInfo}<!-- 欢迎您使用LBE安全大师，Android平台上首款主动式防御软件，第一款具备实时监控与拦截能力的安全软件。
安全大师基于业界首创的API拦截技术，能够实时监控与拦截系统中的敏感操作，动态拦截来自已知和未知的各种威胁。避免各类吸费软件，广告软件乃至木马病毒窃取您手机内的隐私信息以及可能产生的经济损失。
安全大师同时提供了强大的定制功能与完善的提示机制，您更可以精确控制系统中每一个应用的权限，同时不放过任何一次可疑的操作。对于没有获取root权限的用户，您依旧可以使用我们的流量控制，电话短信防火墙，系统优化清理等功能。 --></textarea>
            </div>
          </div>
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">LOGO图片 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
				    <img src="statics/uploadfiles/com.lbe.security.jpg" width="100px;"/> 
            </div>
          </div>
        	<div class="form-group">
        		<div class="col-md-6 col-md-offset-3">
        		<button id="status" type="submit" name="status" value="2" class="btn btn-success">审核通过</button>
        		<button id="status" type="submit" name="status" value="3" class="btn btn-success">审核不通过</button>
          		<button type="button" class="btn btn-primary" id="back">返回</button>
        		</div>
     		</div>
        </form>
        </div>
        <div class="clearfix"></div>
        <div class="x_title">
            <h2>最新版本信息</h2>
            <ul class="nav navbar-right panel_toolbox">
              <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
              </li>
            </ul>
          <div class="clearfix"></div>
        </div>
        <div class="x_content" style="display: block;">
         <br>
        <form class="form-horizontal form-label-left">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">版本号 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input class="form-control col-md-7 col-xs-12" value="2.1" 
              type="text" readonly="readonly" >
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">版本大小 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="number" value="9.00" class="form-control col-md-7 col-xs-12">
            </div>
          </div>
       
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">发布状态 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="hidden" name="publishStatus" id="publishStatus" value="3">预发布
            </div>
          </div>
        
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">版本简介 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea class="form-control col-md-7 col-xs-12">欢迎您使用LBE安全大师，Android平台上首款主动式防御软件，第一款具备实时监控与拦截能力的安全软件。
安全大师基于业界首创的API拦截技术，能够实时监控与拦截系统中的敏感操作，动态拦截来自已知和未知的各种威胁。避免各类吸费软件，广告软件乃至木马病毒窃取您手机内的隐私信息以及可能产生的经济损失。
安全大师同时提供了强大的定制功能与完善的提示机制，您更可以精确控制系统中每一个应用的权限，同时不放过任何一次可疑的操作。对于没有获取root权限的用户，您依旧可以使用我们的流量控制，电话短信防火墙，系统优化清理等功能。</textarea>
            </div>
          </div>
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">apk文件 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
           
			 
			    <p>${appVersion.apkFileName}&nbsp;&nbsp;
			    <a href="#" >下载</a>
			    </p>
			  
            </div>
          </div>
          <div class="clearfix"></div>
          <br/><br/>
        </form>
    </div>
    <div class="clearfix"></div>
    <br/><br/>
  </div>
</div>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/appcheck.js"></script>