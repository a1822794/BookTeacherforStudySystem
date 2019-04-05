<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Wopop_files/jquery.ui.all.css">

</head>
<body>
<form action="${pageContext.request.contextPath}/admin/login_do" method="post">

<div class="login_m">
<div class="login_boder">

<div class="login_padding" id="login_model">

  <h2>账号&nbsp;&nbsp;${msg}</h2>
  <label>
    <input type="text" id="username" name="username" value="admin" class="txt_input txt_input2" onfocus="if (value ==&#39;Your name&#39;){value =&#39;&#39;}" onblur="if (value ==&#39;&#39;){value=&#39;Your name&#39;}" >
  </label>
  <h2>密码</h2>
  <label>
    <input type="password" name="password" id="userpwd" value="123123" class="txt_input" onfocus="if (value ==&#39;******&#39;){value =&#39;&#39;}" onblur="if (value ==&#39;&#39;){value=&#39;******&#39;}">
  </label>
 
 
<h5>账号：admin 密码：123123</h5>
 
  <div class="rem_sub">
  <div class="rem_sub_l">
  
   </div>
    <label>
      <input type="submit" class="sub_button" name="button" id="button" value="SIGN-IN" style="opacity: 0.7;">
    </label>
  </div>
</div>

、



<!--login_padding  Sign up end-->
</div><!--login_boder end-->
</div><!--login_m end-->
 <br> <br>


</form>
</body>
</html>