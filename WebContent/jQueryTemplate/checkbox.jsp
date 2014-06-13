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



<html>
<head>
<title>JS实现选中复选框后文字变色_网页代码站(www.6a8a.com)</title>
<style>
	.checkbox {
	 background-Color:e-xpression(this.checked?'yellow':'buttonface');
	}
</style>
</head>
<script>
function chaCloor(field){
	var pig = field.checked;
	pig?field.nextSibling.style.backgroundColor="skyblue":field.nextSibling.style.backgroundColor="white";
	}
</script>
<body>
<table height=48 width=136>
<tr>
 <td><input type="checkbox" onClick="chaCloor(this)"><span>网页特效</span></td>
</tr>
<tr>
<td><input type="checkbox" onClick="chaCloor(this)"><span>源码下载</span></td>
</tr>
<tr>
<td><input type="checkbox" onClick="chaCloor(this)"><span>编程软件</span></td>
</tr>
</table>
<br />
<p><a href="http://www.6a8a.com">网页代码站</a> - 最专业的网页代码下载网站 - 致力为中国站长提供有质量的网页代码！</p>
</body>
</html>