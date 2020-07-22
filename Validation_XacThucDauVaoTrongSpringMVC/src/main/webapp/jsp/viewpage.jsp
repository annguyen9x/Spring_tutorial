<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<div style="text-align:center; ">
		<form:form action="checkLogin" modelAttribute="emp">
			Username: <form:input path="name"/> <br><br>  
			Password(*): <form:password path="pass"/>    
			<form:errors path="pass" cssClass="error"/><br><br>  
			<input type="submit" value="submit">  
		</form:form>
	</div>
</body>
</html>