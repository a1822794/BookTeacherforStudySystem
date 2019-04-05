<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body onload="wol();">

<form action="${pageContext.request.contextPath}/admin/addDayOrder" method="post">
开放预约: <input type="date" name="date"  id="mydate"/>
<script type="text/javascript">
function wol(){
	var day3 = new Date();
	 day3.setTime(day3.getTime()+2*24*60*60*1000);
	document.getElementById('mydate').valueAsDate =new Date(day3.getFullYear(),(day3.getMonth()),day3.getDate());
}
</script>
<input type="submit" value="开放"/>${msg }
</form>
</body>
</html>
