<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页</title>
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
<script type="text/javascript">
//知识点:
	//ajax请求方式：$.post([url],[callback],['json']);
</script>
</head>
<body>
<div>
	
</div>
</body>
<script type="text/javascript">
	$(function(){
		search();
	});
	function search(){
		$.ajax({
			type:"POST",
			url:"pagination.action",
			data:{"page.pageNo":1,"page.pageSize":2},
			success:callbackdata,
			error:null
		});
	}
	function callbackdata(data){
		alert(data.page.list);
	}
</script>
</html>