<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
<title>测试jQuery对象</title>
</head>
<body>

</body>
<script type="text/javascript">
	/*
	1.$jQuery对象
		alert($);
		$ 是 jQuery 的简写；
	2.自定义jQuery别名;
		var $$ = jQuery.noConflict();
		alert($$);
	3.window.onload();是所有的dom元素加载完毕，包括图片下载完成后执行，效率低；只有最后的window.onload()会生效;
	4.$(document).ready();只需要dom加载完毕，不需要等待图片下载完成，效率高；所有的$(document).ready()会生效;
		$(document).ready(function(){
			alert(1);
		});
		$(document).ready(function(){
			alert(2);
		});
		$(function(){
			alert(1);
		});
		$(function(){
			alert(2);
		});
	*/
</script>
</html>