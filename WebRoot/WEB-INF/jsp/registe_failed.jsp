<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>注册失败</title>
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
		  <h1 class="display-4">注册失败</h1>
		  <p class="lead"><s:property value="msg"/></p>
		  <hr class="my-4">
		  <p class="lead">
		    <a class="btn btn-primary btn-lg" href="redirect_registe" role="button">点击回到注册页面</a>
		  </p>
		</div>
	</body>
</html>
