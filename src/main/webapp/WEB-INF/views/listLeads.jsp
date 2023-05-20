<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Leads</title>
</head>
<body>
<div align="center">
<br>
	<h2>List of Leads</h2><br>
	
	${msg}
	<br><br>
	
	<a href="viewNewLeadPage"><input type="button" value="New Lead"></a>
	
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
			<th>Convert</th>
		</tr>
		
		<c:forEach var="lead" items="${leads}">
		
		<tr>
			<td><a href="leadInfoPage?id=${lead.id}">${lead.firstName}</a></td>
			<td>${lead.lastName}</td>
			<td>${lead.gender}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>
			<td>${lead.city}</td>
			<td>${lead.source}</td>
			<td><a href="editLead?id=${lead.id}"><input type="button" value="Edit"></a></td>
			<td><a href="removeLead?id=${lead.id}"><input type="button" value="Remove"></a></td>
			<td><a href="sendEmail?email=${lead.email}"><input type="button" value="Send Email"></a></td>
			<td><a href="convertLead?id=${lead.id}"><input type="button" value="Convert"></a></td>
		</tr>
		
		</c:forEach>
	</table>
</div>
<br>
</body>
</html>