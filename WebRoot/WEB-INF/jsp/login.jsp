<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>登录</title>
		<link href="css/bootstrap.css" rel="stylesheet"/>
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/popper.js"></script>
		<script src="js/bootstrap.js"></script>
		<style type="text/css">
			body{
					background-image: url(img/1531815618139.jpg);
					background-repeat:no-repeat ;
					background-size:100% 100%;
					background-attachment: fixed;
				}
			#form{
				margin:0 auto;
				margin-top:200px;
				width: 300px;
			}
			#goBack{
				margin-top: 50px;
				float: right;
				margin-right: 100px;
			}
		</style>
	</head>
	<body >
		<form id="form" method="post" action="user_loginUser">
			<div class="form-group">
				<label for="username">用户名：</label>
				<input name="username" id="username" type="text" class="form-control" />
			</div>
			<div class="form-group">
				<label for="pwd">密码：</label>
				<input name="password" id="pwd" type="password" class="form-control" />
			</div>
			<div class="row justify-content-around">
				<div class="col-3"><button type="submit" class="btn btn-primary">登录</button></div>
				<div class="col-3"><button type="button" class="btn btn-primary" onclick="$(location).attr('href','redirect_registe')">注册</button></div>
			</div>
		</form>
		<button id="goBack" class="btn btn-info" onclick="$(location).attr('href','index')">回到首页</button>
	</body>
</html>
