<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/addteacher" method="post">
教师号：<input  type="text" name="teacherno" value="${t.teacherno}"><br>
教师名：<input type="text" name="teachername" value="${t.teachername}"><br>
院系：<input  type="text" name="depart" value="${t.depart}"><br>
职称：<input type="text" name="title" value="${t.title}"><br>
办公地点<input  type="text" name="officeLocl" value="${t.officeLocl}"><br>
研究方向：<input type="text" name="researchDirection" value="${t.researchDirection}"><br>
	<td><input type="submit" value="确定"></td>
<input type="submit" value="添加">
</form>
</body>
</html>