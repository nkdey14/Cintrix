<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Lead Details</title>
</head>
<body>
<div align="center">
	<h2>Search Lead Details</h2><br>
	
	${msg}
	<br><br>
	
	<form action="fetchLeadDetails" method="post">
	<table>
		<tr>
			<td>Enter Mob no.</td>
			<td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Search"></td>
		</tr>
	</table>
	</form>
	<br>
	<a href="listAllLeads"><input type="button" value="Back"></a>
</div>
<br>
</body>
</html>