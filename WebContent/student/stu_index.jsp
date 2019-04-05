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

${user}同学，欢迎登录
<span style="float:right; "><a>个人中心</a></span>
<hr>
<table>
<tr><td>教师</td><td>院系</td><td>操作</td></tr>
<c:forEach items="${teacherlist}" var="t">
<tr><td>${t.teachername}</td><td>${t.depart}</td><td><a href="javascript:void(0)" onclick="order('${pageContext.request.contextPath}/student/stuGetTeaOrder','${t.teacherno}')">预约</a></td></tr>
</c:forEach>
<tr></tr>
</table>
</body>
</html>
<script type="text/javascript">

function order(url,str) {

	  var temp = document.createElement("form");
	  temp.action = url;
	  temp.method = "post";
	  temp.style.display = "none";
	    var opt = document.createElement("textarea");
	    opt.name = "teacherno";
	    opt.value = str;
	    temp.appendChild(opt);
	  document.body.appendChild(temp);
	  temp.submit();
	  return temp;
	}

</script>