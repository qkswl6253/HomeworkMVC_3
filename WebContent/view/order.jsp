<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	background-color: #FFCCCC}
	table td, th{
	border: 1px solid}
	table th {
	background-color: yellow}
</style>
</head>
<body>
	<h2 style="text-align: center">Reading All Request PArameters</h2>
	<br>
	<table style="border:1px solid">
		<tr>
			<th>Parameter Name</th>
			<th>Parameter Value(s)</th>
		</tr>
		
		<tr>
			<td>cardNum</td>
			<td>${order.credit_Card_Number}</td>
		</tr>
		<tr>
			<td>cardType</td>
			<td>${order.credit_Card}</td>
		</tr>
		<tr>
			<td>price</td>
			<td>${order.price_Each}</td>
		</tr>
		<tr>
			<td>initial</td>
			<td>${order.middle_Initial}</td>
		</tr>
		<tr>
			<td>itemNum</td>
			<td>${order.item_Number}</td>
		</tr>
		<tr>
			<td>address</td>
			<td>${order.shipping_Address}</td>
		</tr>
		<tr>
			<td>firstName</td>
			<td>${order.first_Name}</td>
		</tr>
		<tr>
			<td>description</td>
			<td>${order.description}</td>
		</tr>
		<tr>
			<td>lastName</td>
			<td>${order.last_Name}</td>
		</tr>
		


	</table>
</body>
</html>