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
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>

</head>
<body>
<div id="box">代码风格</div>
</body>
<script type="text/javascript">
	/*
	1.代码风格
	① $符号是jQuery的简写模式
	② 所有的$()返回的对象都为jQuery对象,所以jQuery有连缀功能
	*/
	/*
	2.加载模式
	① window.onload()必须等待网页全部加载完毕（包括
	图片等），然后再执行包裹代码
	只能执行一次，如果第二次，那么第一次的执行会被覆盖
	
	② $(document).ready()只需要等待网页中的DOM结构
	加载完毕，就能执行包裹的代码
	可以执行多次，第N次都不会被上
	一次覆盖
	简单写法$(function(){});
	*/
	$(document).ready(function(){
		$("#box").css("color","red").css("font-size","20px").css("font-weight","bolder");
	});
	/*
	3.对象互换
	$("#box").get(0);
	*/
	/*
	4.多个库之间的冲突
	var $$=jQuery;重命名jQuery对象；
	jQuery.noConflict(); 将$符所有权剔除
	*/
</script>
</html>