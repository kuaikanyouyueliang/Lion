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
<title>选择框02</title>
<link rel="stylesheet" type="text/css" href="ui/css/redmond/jquery-ui-1.10.4.custom.min.css" />
<script type="text/javascript" src="ui/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="ui/js/jquery-ui-1.10.4.custom.min.js"></script>
<script type="text/javascript" src="ui/js/jquery.ui.datepicker-zh-CN.js"></script>
</head>
<body>
	<input type="checkbox" id="checkall" name="checkall">全选<br/>
	<input type="checkbox" name="checkname" value="1">1<br/>
	<input type="checkbox" name="checkname" value="2">2<br/>
	<input type="checkbox" name="checkname" value="3">3<br/>
	<input type="checkbox" name="checkname" value="4">4<br/>
	<input type="checkbox" name="checkname" value="5">5<br/>
</body>
<script type="text/javascript">
	/**点击全选全取消*/
	$("input[name='checkall']").click(function(){
		if($(this).prop("checked")){//全选
			$("input[name='checkname']").each(function(){
				$(this).prop("checked",true);
			});
		}else{//全取消
			$("input[name='checkname']").each(function(){
				$(this).prop("checked",false);
			});
		}
	});
	/**当全部都为checked的时候,全选按钮选上,有一个没有选上的话,全选按钮取消*/
	$("input[name='checkname']").click(function(){
		if($("input[name='checkname']:checked").length==$("input[name='checkname']").length){
			$("input[name='checkall']").prop("checked",true);//置全选按钮为true
		}else{
			$("input[name='checkall']").prop("checked",false);//置全选按钮为false
		}
		var checkitems=new Array();//存储选中的值;
		$("input[name='checkname']:checked").each(function(){
			checkitems.push($(this).val());
		});
	});
</script>
</html>