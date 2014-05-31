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
		<title>Datepicker</title>
		<link rel="stylesheet" type="text/css" href="ui/css/redmond/jquery-ui-1.10.4.custom.min.css" />
		<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
		<script type="text/javascript" src="ui/js/jquery-ui-1.10.4.custom.min.js"></script>
		<script type="text/javascript" src="ui/js/jquery.ui.datepicker-zh-CN.js"></script>
		<link rel="stylesheet" type="text/css" href="style/css/lion.css" />
		<script type="text/javascript" src="style/js/default-ui.js"></script>
		<script type="text/javascript" src="style/js/lion.js"></script>
	</head>
	<body>
		<input type="text" id="startDate" value="">
		<input type="text" id="endDate" value="">
	</body>
</html>