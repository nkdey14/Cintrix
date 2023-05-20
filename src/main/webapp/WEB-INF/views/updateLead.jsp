<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Lead Details</title>
</head>
<body>
<div align="center">
	<h2>Edit Lead Details</h2><br>
	
	<form action="updateLead" method="post">
	<table>
		<tr>
			<td><input type="hidden" name="id" value="${lead.id}"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="firstName" value="${lead.firstName}"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lastName" value="${lead.lastName}"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender" value="${lead.gender}" readonly></td>
		</tr>
		<tr>
			<td>Email Id</td>
			<td><input type="email" name="email" value="${lead.email}"></td>
		</tr>
		<tr>
			<td>Mob no.</td>
			<td><input type="text" name="mobile" value="${lead.mobile}"></td>
		</tr>
		<tr>
			<td>City</td>
			<td><input type="text" name="city" value="${lead.city}"></td>
		</tr>
		<tr>
			<td>Source</td>
			<td><select name="source">
				  <option value="Newspaper">Newspaper</option>
				  <option value="Website">Website</option>
				  <option value="Website">Webinar</option>
				  <option value="TV Ads">TV Ads</option>
				</select>
			</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Update"></td>
		</tr>
	</table>
	</form>
	<br>
	<a href="listAllLeads"><input type="button" value="Back"></a>
</div>
<br>
</body>
</html>