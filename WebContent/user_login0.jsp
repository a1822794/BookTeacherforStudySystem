<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
用户登录
<form action="${pageContext.request.contextPath }/userlogin" method="post">
我是学生<input type="radio" name="id" value="0" checked="checked">&nbsp;&nbsp;&nbsp;
我是老师<input type="radio" name="id" value="1"><br>
用户名：<input type="text" name="user"><br>
密码：<input type="text" name="password"><br>
<input type="submit" value="登录">${msg}<br>
<!--<a href="user_register">还没有账号，注册一个</a>-->
</form>
</body>
</html>