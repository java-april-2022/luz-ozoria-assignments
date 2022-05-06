
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	
		<!-- for Bootstrap CSS -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/main.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="js/app.js"></script>
		
		<title>Ninja Gold Game</title>
	</head>
<body>
	<h1 id="counter-header">Your Gold:<c:out value="${gold}"></c:out>.</h1><br><br>
	<div class="container">
		<div class="col col-lg-2 border m-3 p-4 text-center">
			<form action="/gold/add" method="POST" class="row justify-content-md-center">
			    <label>Farm</label>
			    <p>(earns 10-20 gold)</p>
			    <button class=btn-warning> Find Gold! </button>
			  </div>
			</form>
		
	<div>
		<h2>Activities:</h2>
		<p></p>
	</div>

</body>
</html>