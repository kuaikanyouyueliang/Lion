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
<title>分页</title>
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
</head>
<body>
</body>
<script type="text/javascript">
	$(function(){
		search();
	});
	function search(){
		$.ajax({
			type:"POST",
			url:"pagination.action",
			data:{"pagination.pageNo":1,"pagination.pageSize":2,"test":"1"},
			success:null,
			error:null
		});
	}
</script>
</html>