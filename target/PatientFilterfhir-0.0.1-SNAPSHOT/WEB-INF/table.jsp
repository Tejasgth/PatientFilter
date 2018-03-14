<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Patient Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background: url(main.jpg);background-repeat: no-repeat;background-size:1570px 900px ">
<div class="container">
	<TABLE class="table table-bordered" id = "patientfilter">
		<thead>
			<tr>
				<td>Patient Id </td>
		        <td> FirstName</td>
		        <td> LastName</td>
		        <td> DateOfBirth</td>
		        <td>Resident Country</td>
		        
		    </tr>
		</thead>
		<c:forEach var="c" items="${patientinfo}">
		<tr>
		<td>${c.ID}</td>
		<td>${c.firstname}</td>
		<td>${c.lastname}</td>
		<td>${c.dateofbirth}</td>
		<td>${c.residentCountry}</td>
		
		</tr>
		</c:forEach>
	</TABLE>
</div>

</body>

</html>