<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试中心</title>
<link rel="stylesheet" href="css/index.css" />
</head>
<body>
    <center>
        <h2>欢迎来到考试中心</h2>
        <div class="loginBox">
        	<h2>登录</h2>
        	<label for="username">用户名：</label>
        	<input type="text" id="username" />
        	<br/>
        	<label for="username">密码：</label>
        	<input type="password" id="password" />
        	<br/>
        	<input id="submit" type="submit" value="登录"/>
        </div>
<!--         <h3>
            <a href="hello?name=zhangsan">点击跳转</a>
        </h3> -->
    </center>
</body>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</html>