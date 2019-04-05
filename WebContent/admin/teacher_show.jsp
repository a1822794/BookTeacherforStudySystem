<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>    
教师信息
<table border="1">
<tr><td>教师号</td><td>姓名</td><td>院系</td><td>职称</td><td>办公地点</td><td>研究方向</td><td>操作</td></tr>
<c:forEach items="${teacherlist}" var="t">
<tr>
<c:choose>
<c:when test="${modify eq null ||not (modify eq t.teacherno)}">
<td>${t.teacherno}</td>
<td>${t.teachername}</td>
<td>${t.depart}</td>
<td>${t.title}</td>
<td>${t.officeLocl}</td>
<td>${t.researchDirection}</td>
<td><a href="javascript:void(0)" onclick="myclick('${pageContext.request.contextPath}/admin/teacher_modify.jsp','${t.teacherno}')">编辑</a>
<a href="javascript:void(0)" onclick="myclick('${pageContext.request.contextPath}/admin/deletteacher','${t.teacherno}')">删除</a></td> 
	
</c:when>
<c:otherwise>
  <form action="${pageContext.request.contextPath}/admin/modifyteacher" method="post">

<td><input readOnly="true" type="text" name="teacherno" value="${t.teacherno}"></td>
<td><input type="text" name="teachername" value="${t.teachername}"></td>
<td><input  type="text" name="depart" value="${t.depart}"></td>
<td><input type="text" name="title" value="${t.title}"></td>
<td><input  type="text" name="officeLocl" value="${t.officeLocl}"></td>
<td><input type="text" name="researchDirection" value="${t.researchDirection}"></td>
	<td><input type="submit" value="确定"></td></tr>
</form>
</c:otherwise>
</c:choose>
</tr>
</c:forEach>
</table> 
<a href="addteacher.jsp">添加</a>
</body>
</html>
<script type="text/javascript">

function myclick(url,str) {

	  var temp = document.createElement("form");
	  temp.action = url;
	  temp.method = "post";
	  temp.style.display = "none";
	    var opt = document.createElement("textarea");
	    opt.name = "teacherno";
	    opt.value = str;
	    //alert(opt);
	    temp.appendChild(opt);
	  document.body.appendChild(temp);
	  temp.submit();
	  return temp;
	}

</script>