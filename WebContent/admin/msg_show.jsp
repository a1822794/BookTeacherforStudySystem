<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
欢迎登录，管理员：${admin}
<hr/>
<a href="${pageContext.request.contextPath}/admin/student_show">学生信息</a><br/>
<a href="${pageContext.request.contextPath}/admin/teacher_show">教师信息</a><br/>
<a href="${pageContext.request.contextPath}/admin/bookManage.jsp">预约管理</a><br/>

</body>
</html>