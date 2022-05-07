<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="js/app.js"></script>
		
		<title>Show Expenses</title>
	</head>
<body class="container">
	<nav class="navbar">
		<h1>Expense Details</h1>
		<a href="/" class="link">Go back</a>
	</nav>
	
	
	<div class="container" style="border: 1px solid DarkSlateGrey; padding: 30px">
		<div>
			<p class="fw-bold" style="color:DarkSlateGrey">Expense Name:</p>
			<p><c:out value="${expense.expenseName}"/></p>
		</div><br>
		<div>
			<p class="fw-bold" style="color:DarkSlateGrey">Expense Description:</p>
			<p> <c:out value="${expense.description}"/></p>
		</div><br>
		<div>
			<p class="fw-bold" style="color:DarkSlateGrey">Vendor:</p>
			<p><c:out value="${expense.vendor}"/></p>
		</div><br>
		<div>
			<p class="fw-bold" style="color:DarkSlateGrey">Amount Spent:</p>
			<p><c:out value="${expense.amount}"/></p>
		</div><br>
	
	</div>

</body>
</html>