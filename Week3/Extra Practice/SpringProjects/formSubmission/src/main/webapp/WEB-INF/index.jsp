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
		
		<title>Welcome</title>
	</head>
<body>
	<h1>Welcome User!</h1>
	
	<h3>Login</h3>
    <form action="/login" method="post">
        <label>Email:</label>
        <input type="text" name="email">
        <label>Password:</label>
        <input type="text" name="password">
        <input type="submit">
    </form>
    
    <form action="/search">
        <label>Search:</label>
        <input type="text" name="searchTerm">
        <input type="submit">
    </form>
    

</body>
</html>