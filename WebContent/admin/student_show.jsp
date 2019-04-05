<%@page import="com.zs.module.Student"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="${pageContext.request.contextPath}/css/print.css" rel="stylesheet" type="text/css"  media="print" />
</head>
<body>
<div id="MainForm">
<div class="form_boxA">
<h2>学生信息</h2>
<!-- <a href="addstudent.jsp" class="btn_ok btn_yes">添加</a> -->
<table cellpadding="0" cellspacing="0">
<th><button class="btn_ok btn_yes" href="#" onclick=""><a href="addstudent.jsp">添加</a></button></th>
<tr><td>学号</td><td>姓名</td><td>性别</td><td>年级</td><td>院系</td><td>操作</td></tr>

<c:forEach begin="0" end="${(fn:length(studentlist))>10?9: (fn:length(studentlist)-1)}" var="i">
<tr>
<c:choose>
<c:when test="${modify eq null ||not (modify eq studentlist[i].sno)}">
<td>${studentlist[i].sno}</td>
<td>${studentlist[i].sname}</td>
<td>${studentlist[i].sex}</td>
<td>${studentlist[i].grade}</td>
<td>${studentlist[i].depart}</td>
<td><a href="javascript:void(0)" onclick="myclick('${pageContext.request.contextPath}/admin/modify.jsp','${studentlist[i].sno}')">编辑</a>
<a href="javascript:void(0)" onclick="myclick('${pageContext.request.contextPath}/admin/deletstudent','${studentlist[i].sno}')">删除</a></td> 
	
</c:when>
<c:otherwise>
<form action="${pageContext.request.contextPath}/admin/modifystudent" method="post">

<td><input readOnly="true" type="text" name="sno" value="${studentlist[i].sno}"></td>
<td><input type="text" name="sname" value="${studentlist[i].sname}"></td>
<td><select name="sex">
<option value="男" <c:if test="${studentlist[i].sex eq '男' }">selected="selected"</c:if>>男</option>
<option value="女" <c:if test="${studentlist[i].sex eq '女' }">selected="selected"</c:if>>女</option>
</select></td>
<td><select name="grade">
<option value="大一" <c:if test="${studentlist[i].sex eq '大一' }">selected="selected"</c:if>>大一</option>
<option value="大二" <c:if test="${studentlist[i].sex eq '大二' }">selected="selected"</c:if>>大二</option>
<option value="大三" <c:if test="${studentlist[i].sex eq '大三' }">selected="selected"</c:if>>大三</option>
<option value="大四" <c:if test="${studentlist[i].sex eq '大四' }">selected="selected"</c:if>>大四</option>
</select></td>
<td><input type="text" name="depart" value="${s.depart}"></td>
			<td><input type="submit" value="确定"></td></tr>
</form>

</c:otherwise>
</c:choose>
</tr>
</c:forEach>


</table> 
<p class="msg">共找到${studentlistsize }条记录，当前显示从第${page*10-10+1}条至第${page*10 }条</p>
</div>
</div>
<!-- /MainForm -->

<!-- /PageNum -->


<ul id="PageNum">
<li><a href="javascript:void(0)" onclick="pageclick('${pageContext.request.contextPath}/admin/student_show',${1})">首页</a></li>
<li><a href="javascript:void(0)" onclick="pageclick('${pageContext.request.contextPath}/admin/student_show',${(page-1)})">上一页</a></li>
<c:forEach begin="${(page-4)>1?page-4:1 }" end="${(page+4)<((studentlistsize%10)*10>0?(studentlistsize/10+1):studentlistsize/10)?(page+4):((studentlistsize%10)*10>0?(studentlistsize/10+1):studentlistsize/10)}" var="i">
<li><a href="javascript:void(0)" onclick="pageclick('${pageContext.request.contextPath}/admin/student_show',${i})">${i}</a></li>
</c:forEach>
<li><a href="javascript:void(0)" onclick="pageclick('${pageContext.request.contextPath}/admin/student_show',${page+1})">下一页</a></li>
<li><a href="javascript:void(0)" onclick="pageclick('${pageContext.request.contextPath}/admin/student_show',${(studentlistsize%10)*10>0?(studentlistsize/10+1):studentlistsize/10})">尾页</a></li>
</ul>
</body>

</html>
 
<script type="text/javascript">

function myclick(url,str) {

	  var temp = document.createElement("form");
	  temp.action = url;
	  temp.method = "post";
	  temp.style.display = "none";
	    var opt = document.createElement("textarea");
	    opt.name = "sno";
	    opt.value = str;
	    //alert(opt);
	    temp.appendChild(opt);
	  document.body.appendChild(temp);
	  temp.submit();
	  return temp;
	}
function pageclick(url,str) {

	  var temp = document.createElement("form");
	  temp.action = url;
	  temp.method = "post";
	  temp.style.display = "none";
	    var opt = document.createElement("textarea");
	    opt.name = "page";
	    opt.value = str;
	    //alert(opt);
	    temp.appendChild(opt);
	  document.body.appendChild(temp);
	  temp.submit();
	  return temp;
	}
</script>