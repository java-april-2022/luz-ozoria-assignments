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
		
		<title>Edit Expenses</title>
	</head>
<body class="container">
	<nav class="navbar">
		<h1>Expense Details</h1>
		<a href="/" class="link">Go back</a>
	</nav>
	<form:form action="/expenses/edit/${expense.id}" method="post" modelAttribute="expense">
	    <input type="hidden" name="_method" value="put">
	    <div>
	        <form:label path="expenseName">Expense Name:</form:label>
	        <form:errors path="expenseName" class="text-danger"/>
	        <form:input style="width:600px;" path="expenseName"/>
	    </div><br>
	    <div>
	        <form:label path="vendor">Vendor:</form:label>
	        <form:errors path="vendor" class="text-danger"/>
	        <form:input style="width:600px;" path="vendor"/>
	    </div><br>
	    <div>
	        <form:label path="amount">Amount:</form:label>
	        <form:errors path="amount" class="text-danger"/>     
	        <form:input style="width:600px;" type="number" path="amount"/>
	    </div><br>    
	    <div>
	        <form:label path="description">Description:</form:label>
	        <form:errors path="description" class="text-danger"/>
	        <form:textarea style="width:600px;" rows="4" path="description"/>
	    </div><br>
	    <input type="submit" value="Submit" style="width:125px;" class="border-success text-success"/>
	</form:form>

</body>
</html>