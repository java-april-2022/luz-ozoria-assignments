<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
	<nav class="navbar">
		<h1>New Ninja</h1>
		<a href="/dojos/new" class="link">Add a New Dojo</a>
	</nav>
	<div>
		<form:form action="/ninja/create" method="POST" modelAttribute="newNinja">
	
		<div>
			<form:select path="dojo" style="width:400px;" class="form-control">Dojo:
				<c:forEach items="${ allDojos }" var="dojo">
					<form:option value="${ dojo.id }">${dojo.name}</form:option>
				</c:forEach>
				<form:errors path="dojo" class="text-danger"/>
			</form:select>
		</div><br>
	
		<div>
			<form:label path="firstName">First Name: </form:label>
			<form:errors path="firstName" class="text-danger"/>
			<form:input style="width:400px;" path="firstName"/>
		</div><br>
		
		<div>
			<form:label path="lastName">Last Name: </form:label>
			<form:errors path="lastName" class="text-danger"/>
			<form:input style="width:400px;" path="lastName"/>
		</div><br>
		<div>
			<form:label path="age">Age: </form:label>
			<form:errors path="age" class="text-danger"/>
			<form:input style="width:400px;" type="double" path="age"/>
		</div><br>
		<div>
			<input type="submit" value="Submit" style="width:125px;" class="border-success text-success"/>
		</div><br>
		
	
	</form:form>
		
	</div>
</div>
</body>
</html>