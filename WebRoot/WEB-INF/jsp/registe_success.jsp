<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>注册成功</title>
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
		  <h1 class="display-4">注册成功</h1>
		  <p class="lead">恭喜<s:property value="msg"/>注册成功</p>
		  <hr class="my-4">
		  <p class="lead">
		    <a class="btn btn-primary btn-lg" href="redirect_login" role="button">点击登录</a>
		  </p>
		</div>
	</body>
</html>

