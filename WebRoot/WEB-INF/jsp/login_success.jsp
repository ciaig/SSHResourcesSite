<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登录成功</title>
		<link href="css/bootstrap.css" rel="stylesheet"/>
		<link href="css/index.css" rel="stylesheet"/>
		<style type="text/css">
			div{
				width: 500px;
				margin: 0 auto;
				margin-top: 100px;
			}
		</style>
	</head>
	<body>
		<div class="jumbotron">
		  <h1 class="display-4">登录成功</h1>
		  <p class="lead">欢迎${LOGIN.username }</p>
		  <hr class="my-4">
		  <p class="lead">
		    <a class="btn btn-primary btn-lg" href="index" role="button">点击进入首页</a>
		  </p>
		</div>
	</body>
</html>

