<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />

</head>
<body id="bg">
<div class="container">
<div class="leftsidebar_box">

<a href="${pageContext.request.contextPath}/admin/student_show" target="main.jsp">学生信息</a><br/>
<a href="${pageContext.request.contextPath}/admin/teacher_show" target="main.jsp">教师信息</a><br/>
<a href="${pageContext.request.contextPath}/admin/bookManage.jsp" target="main.jsp">预约管理</a><br/>
</div>
</div>
</body>
</html>