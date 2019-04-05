<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="${pageContext.request.contextPath}/css/print.css" rel="stylesheet" type="text/css"  media="print" />
</head>
<body>
<div id="MainForm">
<div class="form_boxA">
<h2>添加用户</h2>
<form action="${pageContext.request.contextPath}/admin/addStudent" method="post">
<table cellpadding="0" cellspacing="0">
<tr><th>学号：</th><th><div class="txtbox floatL"><input type="text" name="sno"></div></th></tr>
<tr><th>姓名：</th><th><div class="txtbox floatL"><input type="text" name="sname"></div></th></tr>
<tr><th>性别：</th><th><div class="txtbox floatL">男<input type="radio" sname="sex" value="男" checked="checked"></div>
<div class="txtbox floatL"><input type="radio" name="sex" value="女">女</div></th></tr>
<tr><th>年级：</th><th><div class="txtbox floatL">
<select name="grade">
<option value="大一" selected="selected">大一</option>
<option value="大二">大二</option>
<option value="大三">大三</option>
<option value="大四">大四</option>
</select></div></th></tr>
<tr><th>院系：</th><th><div class="txtbox floatL">
<input type="text" name="depart"></div></th></tr>
<tr><th><input class="btn_ok btn_yes"type="submit" value="添加"></th><td>${msg }</td></tr>
</form>
</table>
</div></div>
</body>
</html>