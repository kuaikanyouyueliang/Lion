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
	<table id="pagelist">
		
	</table>
	<div id="pagesplit">
	
	</div>
</div>
</body>
<script type="text/javascript">
	$(function(){
		search(1,10);
	});
	function search(pageno,pagesize){
		$.ajax({
			type:"POST",
			url:"pagination.action",
			data:{"page.pageNo":pageno,"page.pageSize":pagesize},
			success:callbackdata,
			error:null
		});
	}
	//回调函数;
	function callbackdata(data){
		var list=data.page.list;
		var split=data.page;
		var table=$("#pagelist");
		//清除表格中的内容
		$("#pagelist tr").remove();
		//在表格中填充数据
		$.each(list,function(index,obj){
			table.append($("<tr><td>"+
					obj.age+"</td><td>"
					+obj.name+"</td></tr>"));
		});
		//分页;
		pagesplit(split.pageNo,split.pageSize,split.totalRows,split.pageAll);
	}
	//使用ajax时，调用的分页;
	function pagesplit(pageno,pagesize,totalrows,pageall){
		var pager=$("#pagesplit");
		//清除分页里面的内容
		$("#pagesplit span").remove();
		//共多少页
		pager.append($("<span>共"+pageall+"页</span>"));
		//每页多少条
		pager.append($("<span>每页"+pagesize+"条</span>"));
		//共多少条
		pager.append($("<span>共"+totalrows+"条</span>"));
		//首页
		pager.append($("<span style=\"cursor:pointer;\">首页<span>").click(function(){
			search(1,pagesize);
		}));
		//上一页
		if(pageno==1){
			pager.append("<span style=\"cursor:pointer;\">上一页<span>");
		}else{
			var pre=$("<span pre=\""+(pageno-1)+"\" style=\"cursor:pointer;\">上一页<span>").click(function(){
				search($(this).attr("pre"),pagesize);
			});
			pager.append(pre);
		}
		//第几页
		pager.append($("<span>第"+pageno+"页</span>"));
		//下一页
		if(pageno==pageall){
			pager.append("<span style=\"cursor:pointer;\">下一页<span>");
		}else{
			var next=$("<span next=\""+(pageno+1)+"\" style=\"cursor:pointer;\">下一页<span>").click(function(){
				search($(this).attr("next"),pagesize);
			});
			pager.append(next);
		}
		//最后一页
		pager.append($("<span style=\"cursor:pointer;\">尾页<span>").click(function(){
			search(pageall,pagesize);
		}));
	}
</script>
</html>