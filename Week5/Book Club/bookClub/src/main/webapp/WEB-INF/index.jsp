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
		
		<title>Book Club - Registration</title>
	</head>
<body class="page-container">
	<div class="header">
			<h1 style="color:purple">Book Club</h1>
			<p style="color:slategrey">A place for friends to share thoughts books.</p>
			<hr>
	</div>
	<div>
		<div class="container">
			<h2 style="color: purple">Register</h2>
			<form:form action="/register" modelAttribute="newUser" class="form" method="POST">
			
				<div class="form-group">
					<form:label for="name" path="name">User Name:</form:label>
						<form:input type="text" path="name" class="form-control"/>
						<form:errors path="name" style="color:red"/>
				</div><br>
				
				<div class="form-group">
					<form:label for="email" path="email">Email:</form:label>
						<form:input type="text" path="email" class="form-control"/>
						<form:errors path="email" style="color:red"/>
				</div><br>
				
				<div class="form-group">
					<form:label for="password" path="password">Password:</form:label>
						<form:password path="password" class="form-control"/>
						<form:errors path="password" style="color:red"/>
				</div><br>
				
				<div class="form-group">
					<form:label for="" path="confirm">Confirm:</form:label>
						<form:password path="confirm" class="form-control"/>
						<form:errors path="confirm" style="color:red"/>
				</div><br>
				
				<div class="form-group">
					<input type="submit" value="Register" class="btn" style="border: 1px solid purple; background: white; color: purple; padding: 5px;"/>
				</div>
							
			</form:form>
		
		</div><br>
		
		<div class="container">
		<h2 style="color:slategrey">Log In</h2>
			<form:form action="/login" modelAttribute="newLogin" class="form">
               <div class="form-group">
					<form:label for="email" path="email">Email:</form:label>
						<form:input type="text" path="email" class="form-control"/>
						<form:errors path="email" style="color:red"/>
				</div><br>
               <div class="form-group">
					<form:label for="password" path="password">Password:</form:label>
						<form:password path="password" class="form-control"/>
						<form:errors path="password" style="color:red"/>
				</div><br>
               <div class="form-group form-button">
                   <input type="submit" value="Log In" class="btn" style="border: 1px solid slategrey; background: white; color: slategrey; padding: 5px;"/>
               </div>
           </form:form>
		
		</div>
	
	
	
	</div>
	

</body>
</html>