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
<title>Insert title here</title>
<!-- jQuery ui包引用 -->
<link rel="stylesheet" type="text/css" href="ui/css/redmond/jquery-ui-1.10.4.custom.min.css" />
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="ui/js/jquery-ui-1.10.4.custom.min.js"></script>
<script type="text/javascript" src="ui/js/jquery.ui.datepicker-zh-CN.js"></script>
</head>
<body>

</body>
</html>