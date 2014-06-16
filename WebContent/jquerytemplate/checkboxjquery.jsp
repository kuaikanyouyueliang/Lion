<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<style type="text/css">
</style>
</head>
<body>
	<input type="checkbox" id="checkname" name="checkname" class="ckclass">
	<label for="checkname">复选框</label>

	<input type="checkbox" name="box" value="0" checked="checked" />

	<input type="checkbox" name="box" value="1" />

	<input type="checkbox" name="box" value="2" />

	<input type="checkbox" name="box" value="3" />
</body>
<script type="text/javascript">
	//1.通过id选择器选取
	/* $("#checkname").click(function(){
		alert("通过id选择器选取");
	}); */
	//2.通过类选择器选取
	/* $(".ckclass").click(function(){
		alert("通过类选择器选取");
	}); */
	//3.通过标签选择器和属性选择器来选取
	$("input[name='checkname']").click(function() {
		//alert("通过标签选择器和类选择器选取");
		alert($(this).prop("checked"));
	});

	//遍历
	/* $("input[name='box']:checked").each(function(){
		alert(4);
	}); */

	$("input[name='box']").click(function() {
		var array = new Array();
		$("input[name='box']").each(function() {
			if (true == $(this).prop("checked")) {//获取选择的checkbox
				array.push($(this).val());
			}
		});
		alert(array);
	});
	$("input[name='box']").each(function(){
		$(this).prop("checked",true);
	});
</script>
</html>