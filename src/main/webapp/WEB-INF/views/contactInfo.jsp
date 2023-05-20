<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Details</title>
</head>
<body>
<div align="center">
	<br>
	${msg}
	<br><br>
	<h2>Contact Details</h2><br>
	
	<table border='1' cellspacing='1' cellpadding='8'>
		<tr>
			<th>First Name</th>
			<td>${contact.firstName}</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${contact.lastName}</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>${contact.gender}</td>
		</tr>
		<tr>
			<th>Email Id</th>
			<td>${contact.email}</td>
		</tr>
		<tr>
			<th>Mob no.</th>
			<td>${contact.mobile}</td>
		</tr>
		<tr>
			<th>City</th>
			<td>${contact.city}</td>
		</tr>
		<tr>
			<th>Source</th>
			<td>${contact.source}</td>
		</tr>
	</table>
	<br>
	<a href="listAllContacts"><input type="button" value="Back"></a>
</div>
<br>
</body>
</html>