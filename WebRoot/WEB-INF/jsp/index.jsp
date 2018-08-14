<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	if(session.getAttribute("allMenu")==null){
		response.sendRedirect("index");
	}
 %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>首页</title>
		<link href="css/bootstrap.css" rel="stylesheet"/>
		<link href="css/index.css" rel="stylesheet" />
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/popper.js"></script>
		<script src="js/bootstrap.js"></script>
	</head>
	<body class="">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">首页</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  	</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
			<c:forEach items="${allMenu }" var="menuItem">
				<li class="nav-item active" id="menuitem">
					<a class="nav-link" href="index.action?menuIndex=${menuItem.id }">${menuItem.name }</a>
				</li>
			</c:forEach>
			</ul>
		</div>
		<form class="form-inline" >
			    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
			    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
		<c:if test="${LOGIN == null }">
			<button class="btn btn-info" style="margin-left: 10px;" onclick="$(location).attr('href','redirect_login')">登录</button>
		</c:if>
		<c:if test="${LOGIN != null }">
			<div class="dropdown" style="margin-left: 10px">
			  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    ${ LOGIN.username }
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			    <a class="dropdown-item" href="#">个人中心</a>
			    <a class="dropdown-item" href="#">我的收藏</a>
			    <a class="dropdown-item" href="user_quit">注销</a>
			  </div>
			</div>
		</c:if>
	</nav>
	<div class="row" id="row">
		<div class="col-1" style="margin-top: 50px">
				<ul class="nav-ul">
					<c:forEach items="${allCategory}" var="category">
						<li><a href="index_content?categoryIndex=${category.id }" class="home"><span>${category.name }</span></a></li>
					</c:forEach>
				</ul>
		</div>
		<div class="col" id="view">
			<div class="card-columns">
				<!-- <div class="card">
					<img class="card-img-top" src="img/104446sibo1o63okk1wb1u.jpg" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">1</p>
					</div>
				</div> -->
				<c:forEach items="${allContent}" var="content">
					<div class="card">
						<img class="card-img-top" src="${content.imgurl }" alt="Card image cap">
						<div class="card-body">
							<h5 class="card-title">${content.name }</h5>
							<a href="content?contentid=${content.id }" class="btn btn-primary" target="blank">查看</a>
						</div>
					</div>
				</c:forEach>
			</div>
			<nav aria-label="Page navigation example">
				  <ul class="pagination justify-content-center">
				    	<c:if test="${currentIndex ==1 }">
					    	<li class="page-item disabled">
					    		<a class="page-link" href="index_content?categoryIndex=${currentCategory }&currentIndex=${currentIndex-1}" tabindex="-1">Previous</a>
					    	</li>
				    	</c:if>
				    	<c:if test="${currentIndex !=1 }">
					    	<li class="page-item">
					    		<a class="page-link" href="index_content?categoryIndex=${currentCategory }&currentIndex=${currentIndex-1}" tabindex="-1">Previous</a>
					    	</li>
				    	</c:if>
				    <c:forEach begin="1" end="${totalPage }" var="i">
				    	 <c:if test="${currentIndex == i }">
					    	<li class="page-item active">
					    		<a class="page-link" href="index_content?categoryIndex=${currentCategory }&currentIndex=${i}" >${i }</a>
					    	</li>
				    	</c:if>
				    	<c:if test="${currentIndex != i}">
					    	<li class="page-item">
					    		<a class="page-link" href="index_content?categoryIndex=${currentCategory }&currentIndex=${i}" >${i }</a>
					    	</li>
				    	</c:if>
				    </c:forEach>
				    <c:if test="${currentIndex == totalPage }">
					    	<li class="page-item disabled">
					    		<a class="page-link" href="index_content?categoryIndex=${currentCategory }&currentIndex=${currentIndex+1}" tabindex="-1">next</a>
					    	</li>
				    	</c:if>
				    <c:if test="${currentIndex != totalPage}">
					    	<li class="page-item">
					    		<a class="page-link" href="index_content?categoryIndex=${currentCategory }&currentIndex=${currentIndex+1}" tabindex="-1">next</a>
					    	</li>
				    </c:if>
				  </ul>
			</nav>
		</div>
	</div>
	</body>
</html>
