<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <html>
<head>
<title>First Web Application</title>
</head>
<body>
	<h3>currently login user is ${name}</h3>
	this is list of employee ${Emloyees}!!
	<br>
	<br> Welcome ${name}!!
	<a href="/add-Employee">click here </a>Add or update the Employees.

</body>
</html> --%>


<html>

<head>
<title>log in is ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Your Employee are</caption>
			<thead>
				<tr>
					<th>Id</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>salary</th>
				    <th>role</th>
				    <th>Date</th>
				    
	
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items= "${Employees}" var="Employee">
					<tr>
						<td>${Employee.idEmployee}</td>
						<td>${Employee.firstName}</td>
						<td>${Employee.lastName}</td>
						<td>${Employee.email}</td>
						<td>${Employee.salary}</td>
						<td>${Employee.role}</td>
						<td>${Employee.joiningDAte}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div> <a class="button" href="/add-Employee">Add a Employee</a></div>

		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>