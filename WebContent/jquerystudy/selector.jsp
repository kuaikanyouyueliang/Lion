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
<title>常规选择器</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
<style type="text/css">
	/*#box{
		color:red
	}*/
</style>
<script type="text/javascript">
//知识点：
	//元素选择包括：ID选择器，标签选择器（div），类选择器（clss）；
	//length 或 size() 返回对象的个数
	//get获取原生的值dom对象, eq 得到对象的第几个；
	//css是添加样式，jQuery是添加行为；
	//#box > p 只求出子节点，不需要看到 孙子节点（原生css）
</script>
</head>
<body>
<div id="" class="pox">简单选择器1</div>
<div id="" class="pox">简单选择器32</div>
<div id="" class="pox">简单选择器3</div>
<div id="" class="pox">简单选择器4</div>
</body>
<script type="text/javascript">
	/* $(function(){
		$("#box").css("color","blue");
	}); */
	/* $("div").css("color","blue"); 
	$(function(){
	$(".pox").css("color","red");
});
	$(".pox").eq(0).css("color","red")
	*/
</script>
</html>