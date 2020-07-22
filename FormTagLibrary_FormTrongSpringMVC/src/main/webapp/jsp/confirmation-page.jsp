<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Confirmed Successfully</title>
</head>
<body>
	<div style="text-align: center; ">
		<p>Your reservation is confirmed successfully. Please, re-check the details</p>
		<!-- Được truyền vào ở @RequestAttribute("reservation") -->
		<p>First Name: ${reservation.firstName }</p>
		<p>Last Name: ${reservation.lastName }</p>
	</div>
</body>
</html>