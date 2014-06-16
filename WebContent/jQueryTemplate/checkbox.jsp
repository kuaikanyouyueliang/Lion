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
</head>
<body>

</body>
<script type="text/javascript">
	function check(){
		//左侧checkbox选择
		var objLeft=document.getElementsByName("checkname");
		var arr=new Array();
		var j=0;
		for(var i=0;i<objLeft.length;i++){
			//复选框选中的颜色
			objLeft[i].checked?objLeft[i].nextSibling.style.backgroundColor="skyblue":objLeft[i].nextSibling.style.backgroundColor="white";
			if(objLeft[i].checked==true){
				arr[j]=objLeft[i].value;
				j++;
			}
		}
	}
</script>
</html>
