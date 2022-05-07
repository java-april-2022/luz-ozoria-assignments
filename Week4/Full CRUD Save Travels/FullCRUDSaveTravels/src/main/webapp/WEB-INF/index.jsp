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
		
		<title>Expenses</title>
	</head>
<body class="container">
<h1>Save Travels</h1>

<table class="table table-success table-striped">
    <thead class="text-center">
        <tr>
            <th scope="col">Expense</th>
            <th scope="col">Vendor</th>
            <th scope="col">Amount</th>
            <th scope="col">Actions</th>
        </tr>
    </thead>
    <tbody class="text-center">
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td><a href="/expenses/show/<c:out value="${expense.id}"/>" class="link"><c:out value="${expense.expenseName}"/></a></td>
				<td><c:out value="${expense.vendor}"></c:out></td>
				<td>$<c:out value="${expense.amount}"></c:out></td>
				<td>
					<span id="links">
					<a href="/expenses/edit/<c:out value="${expense.id}"/>">edit</a>
					<form:form action="/expenses/delete/${expense.id}" method="POST"><input type="hidden" name="_method" value="delete"><input class="btn btn-danger" type="submit" value="Delete"></form:form>
				</td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
<br>

<div>
<h2>Add an Expense:</h2>
<form:form action="/expenses" method="post" modelAttribute="expense">

	<div>
		<form:label path="expenseName">Expense Name: </form:label>
		<form:errors path="expenseName" class="text-danger"/>
		<form:input style="width:400px;" path="expenseName"/>
	</div><br>

	<div>
		<form:label path="vendor">Vendor: </form:label>
		<form:errors path="vendor" class="text-danger"/>
		<form:input style="width:400px;" path="vendor"/>
	</div><br>
	
	<div>
		<form:label path="amount">Amount: </form:label>
		<form:errors path="amount" class="text-danger"/>
		<form:input style="width:400px;" type="double" path="amount"/>
	</div><br>
	
	<div>
		<form:label path="description">Description: </form:label>
		<form:errors path="description" class="text-danger"/>
		<form:textarea style="width:400px;" rows="4" path="description"/>
	</div><br>
	
	<div>
		<input type="submit" value="Submit" style="width:125px;" class="border-success text-success"/>
	</div><br>
	
	

</form:form>
</div>



</body>
</html>