<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
${teacherno}老师的预约情况
<form action="${pageContext.request.contextPath}/student/orderApplication" method="post">
<table border="1">
<tr><td>开始时间</td><td>结束时间</td><td>预约情况</td><td>选择</td></tr>
<c:forEach items="${list}" var="l">
<c:if test="${(l.state eq 0) and ((l.sno eq null)or(l.sno eq ''))}">
<tr><td>${fn:replace(l.starttime,':00.0','')}</td>

<td>
${fn:replace(l.endtime,':00.0','')}</td>

<td><font color="green">可预约</font></td>
<td>
<input type="checkbox" name="time" value="${l.starttime}&${l.endtime}" style="zoom:180%;">
</td></tr>
</c:if >
<c:if test="${(l.state eq 2) or !(l.sno eq null)and!(l.sno eq user) and !(l.sno eq '') }">
<td>${fn:replace(l.starttime,':00.0','')}</td>

<td>
${fn:replace(l.endtime,':00.0','')}</td>
<td>不可预约</td>
<td>
<input type="checkbox" disabled="disabled" style="zoom:180%;">
</td></tr>
</c:if>
<c:if test="${(l.state eq 1) and (l.sno eq user) }">
<tr>
<td>${fn:replace(l.starttime,':00.0','')}</td>

<td>
${fn:replace(l.endtime,':00.0','')}</td>
<td>审核中</td>
<td>
<input type="checkbox" disabled="disabled" style="zoom:180%;">
</td>
</tr>
</c:if>

</tr>
</c:forEach>
</table>
<input type="submit" value="提交">${msg}
</form>
</body>
</html>