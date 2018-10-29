function reload(){
	window.location.reload();
}
function help(msg){
    alert('欢迎使用'+msg);
}

function to(url){
	window.location.href=url;
}
function back(){
	history.go(-1);
}
function save(url){
    alert('保存成功！');
    to(url);
}
function add(url){
    alert('新建成功！');
    to(url);
}
function del(msg){
   return window.confirm("确认删除"+msg+"？")
}
function setCurTime(oid){
	var now=new Date();
	var year=now.getFullYear();
	var month=now.getMonth()+1;
	var day=now.getDate();
	var hours=now.getHours();
	var minutes=now.getMinutes();
	var seconds=now.getSeconds();
	var timeString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
	var oCtl = document.getElementById(oid);
	oCtl.value = timeString;
}
function formatTime(time,type){
    var now=new Date(time);
    var year=now.getFullYear();
    var month=now.getMonth();
    var day=now.getDate();
    var hours=now.getHours();
    var minutes=now.getMinutes();
    var seconds=now.getSeconds();
    if(type==1){
    	return year+"-"+month+"-"+day;
	}else if(type==2){
        return year+"年"+month+"月"+day+"日  "+hours+"时"+minutes+"分"+seconds+"秒";
	}else{
        return year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
	}
}

function toUrl(id,url){
    localStorage.setItem("id",id);
    to(url);
}
function toLinkMan(no,url,custName){
    localStorage.setItem("no",no);
    localStorage.setItem("custName",custName);
    to(url);
}
function toOrdersDetail(id,url){
    localStorage.setItem("order_id",id);
    to(url);
}
function toActivityUrl(id,url){
    localStorage.setItem("activity_id",id);
    to(url);
}
/*
function toLost(id,url){
    localStorage.setItem("activity_id",id);
    to(url);
}*/
