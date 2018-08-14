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
		<title>注册</title>
		<link href="css/bootstrap.css" rel="stylesheet"/>
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/popper.js"></script>
		<script src="js/bootstrap.js"></script>
		<style type="text/css">
			body{
				background-image: url(img/480924910a1df741.jpg);
				background-repeat: no-repeat;
				background-size: 100% 100%;
				background-attachment: fixed;
			}
			#form{
				width: 500px;
				margin: 0 auto;
				margin-top: 200px;
			}
			#goBack{
				margin-top: 50px;
				float: right;
			}
		</style>
	</head>
	<body >
		<form id="form" method="post" action="user_registe">
			<div class="form-group">
				<label for="username">用户名：</label>
				<input name="username" id="username" type="text" class="form-control" />
			</div>
			<div class="form-group">
				<label for="pwd">密码：</label>
				<input name="password" id="pwd" type="password" class="form-control" />
			</div>
			<div class="form-group">
				<label for="email">Email：</label>
				<input name="email" id="email" type="email" class="form-control" />
			</div>
			<div class="form-group">
				<label for="sex">性别</label>
				<select name="sex" class="form-control" id="sex">
					<option value="男">男</option>
					<option value="女">女</option>
				</select>
			</div>
			<div class="row justify-content-around">
				<div class="col-3"><button type="submit" class="btn btn-primary">注册</button></div>
				<div class="col-3"><button type="reset" class="btn btn-primary">重置</button></div>
			</div>
		</form>
		<button id="goBack" class="btn btn-info" onclick="$(location).attr('href','redirect_login')">回到登录页面</button>
	</body>
</html>
