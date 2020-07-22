<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>
</head>
<body>
	<div>
		<h2>Contact Manager</h2>
		<h4 style="color:blue;"><%=request.getParameter("message") %></h4>
		<form:form method="post" action="addContact.html">
			<table>
				<tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name</form:label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><form:label path="telephone">Telephone</form:label></td>
					<td><form:input path="telephone" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Add Contact" /></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>