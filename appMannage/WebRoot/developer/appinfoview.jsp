<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="clearfix"></div>
<div class="row">
  <div class="co1l-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
      <div class="x_title">
        <h2>查看APP信息 <i class="fa fa-user"></i><small>${devUser.devName }</small></h2>
             <div class="clearfix"></div>
      </div>
      <div class="x_title">
            <h2>APP基础信息</h2>
          <div class="clearfix"></div>
      </div>
      <div class="x_content1">
        <form class="form-horizontal form-label-left" >
          <input type="hidden" name="id" value="">
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
             	value="<c:if test="${appinfo.flatformId==1 }">手机</c:if>	
               		<c:if test="${appinfo.flatformId==2 }">平板</c:if>		
              	 	<c:if test="${appinfo.flatformId==3 }">通用</c:if>"	
              	readonly="readonly">
            
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="select">所属分类 <span class="required">*</span></label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control col-md-7 col-xs-12" 
              	value="${appinfo.categoryLevel1 }--> ${appinfo.categoryLevel1 }--> ${appinfo.categoryLevel1 }" readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">APP状态 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
            	<input type="text" class="form-control col-md-7 col-xs-12" 
              		value="<c:if test="${appinfo.status==1 }">待审核</c:if>
	              		<c:if test="${appinfo.status==2 }">审核通过</c:if>
	              		<c:if test="${appinfo.status==3 }">审核不通过</c:if>
	              		<c:if test="${appinfo.status==4 }">已上架</c:if>
	              		<c:if test="${appinfo.status==5 }">已下架</c:if>" 
              		readonly="readonly">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">应用简介 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea class="form-control col-md-7 col-xs-12" readonly="readonly"> 
              	${appinfo.appInfo }
              </textarea>
            </div>
          </div>
           <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">LOGO图片 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">			   
				    <img src="${appinfo.logoPicPath }" width="100px;"/> 				  
            </div>
          </div>
        </form>
        </div>
        <div class="clearfix"></div>
        <div class="x_title">
            <h2>历史版本列表</h2>
            <ul class="nav navbar-right panel_toolbox">
              <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
              </li>
            </ul>
          <div class="clearfix"></div>
        </div>
        <div class="x_content" style="display: block;">
         <br>
        <div id="datatable-responsive_wrapper"
			class="dataTables_wrapper form-inline dt-bootstrap no-footer">
			<div class="row">
				<div class="col-sm-12">
					<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
						cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
						<thead>
							<tr role="row">
								<th class="sorting_asc" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									style="width: 70px;" aria-label="First name: activate to sort column descending"
									aria-sort="ascending">软件名称</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									style="width: 10px;"
									aria-label="Last name: activate to sort column ascending">
									版本号</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									style="width: 90px;"
									aria-label="Last name: activate to sort column ascending">
									版本大小(单位:M)</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									style="width: 50px;"
									aria-label="Last name: activate to sort column ascending">
									发布状态</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									style="width: 50px;"
									aria-label="Last name: activate to sort column ascending">
									APK文件下载</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									style="width: 50px;"
									aria-label="Last name: activate to sort column ascending">
									最新更新时间</th>
							</tr>
						</thead>
						<tbody>
							
								<tr role="row" class="odd">
									<td tabindex="0" class="sorting_1">aaaaa</td>
									<td>aaaaa</td>
									<td>aaaaa</td>
									<td>aaaaa</td>
									<td>
									<a href="#">aaaaa</a>
									</td>
									<td>2000-1-1</td>
								</tr>
									<tr role="row" class="odd">
									<td tabindex="0" class="sorting_1">aaaaa</td>
									<td>aaaaa</td>
									<td>aaaaa</td>
									<td>aaaaa</td>
									<td>
									<a href="#">aaaaa</a>
									</td>
									<td>2000-1-1</td>
								</tr>	
								<tr role="row" class="odd">
									<td tabindex="0" class="sorting_1">aaaaa</td>
									<td>aaaaa</td>
									<td>aaaaa</td>
									<td>aaaaa</td>
									<td>
									<a href="#">aaaaa</a>
									</td>
									<td>2000-1-1</td>
								</tr>
						</tbody>
					</table>
				</div>
			</div>
      </div>
    </div>
     <div class="form-group">
        <div class="col-md-6 col-md-offset-3">
          <button type="button" class="btn btn-primary" id="back">返回</button>
        </div>
      </div>
    <div class="clearfix"></div>
    <br/><br/>
  </div>
</div>
<%@include file="common/footer.jsp"%>