<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"category1",
			type:"GET",
			dataType:"json",
			success:function(result){
				var str=" <option value='0'>--请选择--</option>";
				for(var i=0;i<result.length;i++){
					str+="<option value='"+result[i].id+"'>"+result[i].categoryName+"</option>";
				}
				$("#queryCategoryLevel1").html(str);
			}
		});
		$("#queryCategoryLevel1").change(function(){
			var id=$(this).val();
			//alert(id);
			if(id!=0){
				$.ajax({
					url:"category2/"+id,
					type:"GET",
					dataType:"json",
					success:function(result){
						var str=" <option value='0'>--请选择--</option>";
						for(var i=0;i<result.length;i++){
							str+="<option value='"+result[i].id+"'>"+result[i].categoryName+"</option>";
						}
						$("#queryCategoryLevel2").html(str);
					}
				});
			}else{
				$("#queryCategoryLevel2").html("");
				$("#queryCategoryLevel3").html("");
			}
		});
		$("#queryCategoryLevel2").change(function(){
			var id=$(this).val();
			//alert(id);
			if(id!=0){
				$.ajax({
					url:"category3/"+id,
					type:"GET",
					dataType:"json",
					success:function(result){
						var str=" <option value='0'>--请选择--</option>";
						for(var i=0;i<result.length;i++){
							str+="<option value='"+result[i].id+"'>"+result[i].categoryName+"</option>";
						}
						$("#queryCategoryLevel3").html(str);
					}
				});
			}else{
				$("#queryCategoryLevel3").html("");
			}
		});
	});
	function delAppInfo(id){
		$.ajax({
			url:"appinfos/"+id,
			type:"GET",
			success:function(result){
				if(result=="1"){
					alert("删除成功!");
					window.location.href="appinfolist.html";
				}else{
					alert("删除失败!")
				}
			}
		});
	}
</script>
<div class="clearfix"></div>
<div class="row">
	<div class="col-md-12">
		<div class="x_panel">
			<div class="x_title">
				<h2>
					APP 信息管理维护 <i class="fa fa-user"></i><small>${devUser.devCode}
						- 您可以通过搜索或者其他的筛选项对APP的信息进行修改、删除等管理操作。^_^</small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<form method="post" action="appinfolist.html">					
			    <ul>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">软件名称</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<input name="softwareName" type="text" class="form-control col-md-7 col-xs-12" value="">
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">APP状态</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<select name="status" class="form-control">
									   <option value="0">--请选择--</option>
									 <option value="1">待审核</option>
									  <option value="2">审核通过</option>
									   <option value="3">审核未通过</option>
									    <option value="4">已上架</option>
									  <option value="5">已下架</option>
        						</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">所属平台</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<select name="flatformId" class="form-control">
									   <option value="0">--请选择--</option>
									    <option value="1">手机</option>
									     <option value="2">平板</option>
									      <option value="3">通用</option>
        						</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">一级分类</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<select id="queryCategoryLevel1" name="categoryLevel1" class="form-control">																					   		
        						</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">二级分类</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="hidden" name="categorylevel2list" id="categorylevel2list"/>
        						<select name="categoryLevel2" id="queryCategoryLevel2" class="form-control">
 								</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">三级分类</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
        						<select name="categoryLevel3" id="queryCategoryLevel3" class="form-control"> 
        						</select>
							</div>
						</div>
					</li>
					<li><button type="submit" class="btn btn-primary"> 查 &nbsp;&nbsp;&nbsp;&nbsp;询 </button></li>
				</ul>
			</form>
		</div>
	</div>
</div>
<div class="col-md-12 col-sm-12 col-xs-12">
	<div class="x_panel">
		<div class="x_content">
			<p class="text-muted font-13 m-b-30"></p>
			<div id="datatable-responsive_wrapper"
				class="dataTables_wrapper form-inline dt-bootstrap no-footer">
				<div class="row">
					<div class="col-sm-12">
					<a href="developer/appinfoadd.jsp" class="btn btn-success btn-sm">新增APP基础信息</a>
						<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
							cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="First name: activate to sort column descending"
										aria-sort="ascending">软件名称</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										APK名称</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										软件大小(单位:M)</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										所属平台</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										所属分类(一级分类、二级分类、三级分类)</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										状态</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										下载次数</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										最新版本号</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 124px;"
										aria-label="Last name: activate to sort column ascending">
										操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${list}" var="li" varStatus="vs">
									<tr role="row" class="odd"
										<c:if test="${vs.index%2==0 }">style="background:#D3D3D3;"</c:if>
									>
										<td tabindex="0" class="sorting_1">${li.appinfo.softwareName }</td>
										<td>${li.appinfo.APKName }</td>
										<td>${li.appinfo.softwareSize }</td>
										<td>
											<c:if test="${li.appinfo.flatformId==1 }">手机</c:if>
											<c:if test="${li.appinfo.flatformId==2 }">平板</c:if>
											<c:if test="${li.appinfo.flatformId==3 }">通用</c:if>
										</td>
										<td>${li.categoryDTO.category1 } -> ${li.categoryDTO.category2 } -> ${li.categoryDTO.category3 }</td>
										<td>
											<c:if test="${li.appinfo.status==1 }">待审核</c:if>
											<c:if test="${li.appinfo.status==2 }">审核通过</c:if>
											<c:if test="${li.appinfo.status==3 }">审核不通过</c:if>
											<c:if test="${li.appinfo.status==4 }">已上架</c:if>
											<c:if test="${li.appinfo.status==5 }">已下架</c:if>
										</td>
										<td>${li.appinfo.downloads}</td>
										<td>${li.appinfo.versionNo}</td>
										<td>
										<div class="btn-group">
                      <button type="button" class="btn btn-danger">点击操作</button>
                      <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <span class="caret"></span>
                        <span class="sr-only">Toggle Dropdown</span>
                      </button>
                      <ul class="dropdown-menu" role="menu">
                        <li>                   
							<a class="saleSwichOpen" saleSwitch="open"  href="#"
								data-toggle="tooltip" data-placement="top" title="" data-original-title="恭喜您，您的审核已经通过，您可以点击上架发布您的APP">上架</a>		
                        </li>
                        <li><a class="addVersion" href="appversionadd.html?appId=${li.appinfo.id }" 
                        		data-toggle="tooltip" data-placement="top" title="" data-original-title="新增APP版本信息">新增版本</a>
                        </li>
                        <li><a class="modifyVersion" href="appversionmodify.html?appId=${li.appinfo.id }"					
								data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP最新版本信息">修改版本</a>
                        </li>
                        <li><a  class="modifyAppInfo" href="developer/appinfomodify.jsp"
											data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP基础信息">修改</a></li>
                        <li><a  class="viewApp"  href="appinfoview.html?id=${li.appinfo.id }"  data-toggle="tooltip" data-placement="top" title="" data-original-title="查看APP基础信息以及全部版本信息">查看</a></li>
						<li><a  class="deleteApp" href="javascript:delAppInfo(${li.appinfo.id })"  data-toggle="tooltip" data-placement="top" title="" data-original-title="删除APP基础信息以及全部版本信息">删除</a></li>
                      </ul>
                    </div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-5">
						<div class="dataTables_info" id="datatable-responsive_info"
							role="status" aria-live="polite">共${params.count }条记录
							${params.pageNo }/${params.countPage }页</div>
					</div>
					<div class="col-sm-7">
						<div class="dataTables_paginate paging_simple_numbers"
							id="datatable-responsive_paginate">
							<ul class="pagination">
								<li class="paginate_button previous"><a
									href="appinfolist.html?pageNo=1&softwareName=${params.softwareName}&
									status=${params.status}&flatformId=${params.flatformId}&categoryLevel1=
									${params.categoryLevel1}&categoryLevel2=${params.categoryLevel2}
									&categoryLevel3=${params.categoryLevel3}"
									aria-controls="datatable-responsive" data-dt-idx="0"
									tabindex="0">首页</a>
								</li>
								<li class="paginate_button "><a
									href="appinfolist.html?pageNo=${params.pageNo-1}&softwareName=
									${params.softwareName}&status=${params.status}&flatformId=
									${params.flatformId}&categoryLevel1=${params.categoryLevel1}&
									categoryLevel2=${params.categoryLevel2}&categoryLevel3=${params.categoryLevel3}"
									aria-controls="datatable-responsive" data-dt-idx="1"
									tabindex="0">上一页</a>
								</li>
								<li class="paginate_button "><a
									href="appinfolist.html?pageNo=${params.pageNo+1}&softwareName=
									${params.softwareName}&status=${params.status}&flatformId=
									${params.flatformId}&categoryLevel1=${params.categoryLevel1}&
									categoryLevel2=${params.categoryLevel2}&categoryLevel3=${params.categoryLevel3}"
									aria-controls="datatable-responsive" data-dt-idx="1"
									tabindex="0">下一页</a>
								</li>
								<li class="paginate_button next"><a
									href="appinfolist.html?pageNo=${params.countPage}&softwareName=
									${params.softwareName}&status=${params.status}&flatformId=
									${params.flatformId}&categoryLevel1=${params.categoryLevel1}&
									categoryLevel2=${params.categoryLevel2}&categoryLevel3=${params.categoryLevel3}"
									aria-controls="datatable-responsive" data-dt-idx="7"
									tabindex="0">最后一页</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
<%@include file="common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/rollpage.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/appinfolist.js"></script>