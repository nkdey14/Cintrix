<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Contacts</title>
</head>
<body>
<div align="center">
<br>
	<h2>List of Contacts</h2><br>
	
	${msg}
	<br><br>
	
	<table border='1' cellspacing='1' cellpadding='8'>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Email Id</th>
			<th>Mob no.</th>
			<th>City</th>
			<th>Source</th>
			<th>Edit</th>
			<th>Remove</th>
			<th>Send Email</th>
		</tr>
		
		<c:forEach var="contact" items="${contacts}">
		
		<tr>
			<td><a href="contactInfoPage?id=${contact.id}">${contact.firstName}</a></td>
			<td>${contact.lastName}</td>
			<td>${contact.gender}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.city}</td>
			<td>${contact.source}</td>
			<td><a href="editLead?id=${contact.id}"><input type="button" value="Edit"></a></td>
			<td><a href="removeLead?id=${contact.id}"><input type="button" value="Remove"></a></td>
			<td><a href="sendEmail?email=${contact.email}"><input type="button" value="Send Email"></a></td>
		</tr>
		
		</c:forEach>
	</table>
</div>
<br>
</body>
</html>