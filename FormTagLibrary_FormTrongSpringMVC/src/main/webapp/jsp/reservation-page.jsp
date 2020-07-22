<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
</head>
<body>
	<h3>Railway Reservation Form</h3>  
	<div style="text-align: center; ">
		<form:form action="submitForm" modelAttribute="reservation">
			
			<!-- path="một thuộc tính của bean, tương đương name nhưng ở đây(bean) dạng Object", Mặc định type="text" -->
			 First name: <form:input path="firstName"/>
			 <br/><br/>
			 Last Name: <form:input path="lastName"/>
			 <br/><br/>
			<input type="submit" name="Submit" />
		</form:form>
	</div>
</body>
</html>