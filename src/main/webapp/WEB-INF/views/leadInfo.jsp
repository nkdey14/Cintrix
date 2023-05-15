<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Details</title>
</head>
<body>
<div align="center">
	<br>
	${msg}
	<br><br>
	<h2>Lead Details</h2><br>
	
	<table border='1' cellspacing='1' cellpadding='8'>
		<tr>
			<th>First Name</th>
			<td>${lead.firstName}</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${lead.lastName}</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>${lead.gender}</td>
		</tr>
		<tr>
			<th>Email Id</th>
			<td>${lead.email}</td>
		</tr>
		<tr>
			<th>Mob no.</th>
			<td>${lead.mobile}</td>
		</tr>
		<tr>
			<th>City</th>
			<td>${lead.city}</td>
		</tr>
		<tr>
			<th>Source</th>
			<td>${lead.source}</td>
		</tr>
	</table>
	<br>
	<a href="listAllLeads"><input type="button" value="Back"></a>
</div>
<br>
</body>
</html>