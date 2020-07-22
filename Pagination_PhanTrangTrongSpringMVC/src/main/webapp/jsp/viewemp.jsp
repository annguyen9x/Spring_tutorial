<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employ List Page</title>
</head>
<body>
	<div style="text-align: center;">
		<h1>Employees List</h1>
		<table border="2" width="70%" cellpadding="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Salary</th>
			</tr>
			<c:forEach var="emp" items="${msg}">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.salary}</td>
				</tr>
			</c:forEach>
		</table>
		<br /> 
		<a href="/Pagination_PhanTrangTrongSpringMVC/viewemp/1">1</a> 
		<a href="/Pagination_PhanTrangTrongSpringMVC/viewemp/2">2</a> 
		<a href="/Pagination_PhanTrangTrongSpringMVC/viewemp/3">3</a>
	</div>
</body>
</html>