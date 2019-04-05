<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/user_login.css" />

</head>
<body>
<img src="${pageContext.request.contextPath }/img/bg2.jpg" width="100%" height="100%" style="z-index:-

100;position:absolute;left:0;top:0">
<form action="${pageContext.request.contextPath }/userlogin" method="post">

<div class="top">预约系统</div>	
		<div class="content">
			<div class="login">
			<div class="title">用户登录</div>
			
			我是学生<input type="radio" name="id" value="0" checked="checked">&nbsp;&nbsp;&nbsp;
			我是老师<input type="radio" name="id" value="1"><br>
				
				<div class="line">
					<img class="smallImg" src="${pageContext.request.contextPath }/img/icon1.png" />
					<input placeholder="请输入账号" type="text" name="user"/>
				</div>
				<div class="line">
					<img class="smallImg" src="${pageContext.request.contextPath }/img/icon2.png" />
					<input placeholder="请输入密码" type="password" name="password"/><h5>账号密码均为学号</h5>${msg}
				</div>
				<input type="submit" class="logBut" value="登&nbsp;&nbsp;录"></button>
				<a href="${pageContext.request.contextPath}/admin/admin_login.jsp"><br>管理员登录</a>
				
			</div>
		</div>
	</form>
	
</body>
</html>