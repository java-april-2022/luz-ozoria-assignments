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
		<h1>Person Details</h1>
		<a href="/" class="link">Go back</a>
	</nav>
	
	
	<table class="table">
	    <thead class="thead-dark">
	        <tr>
	            <th>Name</th>
	            <th>License Number</th>
	            <th>State</th>
	            <th>Exp Date</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td>
	                <c:out value="${person.firstName}"/>
	                <c:out value="${person.lastName}"/>
	            </td>
	            <td><c:out value="${person.license.state}"/></td>
	            <td><c:out value="${person}"/></td>
	            <td>
	                <c:out value="${person.license.expirationDate}"/>
	            </td>
	        </tr>
	    </tbody>
	</table>

</body>
</html>