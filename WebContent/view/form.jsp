<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body {
	background-color: #FFCCCC}

</style>
<title>Insert title here</title>
</head>
<body>

	<H2 style="text-align: center">A Simple Form</H2>
	<br>
	<form action="/HomeworkMVC_3/insertinform?action=insert">
		Item Number : <input type="text" name="Item_Number"><br>
		Description : <input type="text" name="Description"><br>
		Price Each : <input type="text" name="Price_Each">
		<hr>
		First Name : <input type="text" name="First_Name"><br>
		Last Name : <input type="text" name="Last_Name"><br>
		Middle Initial : <input type="text" name="Middle_Initial"><br>
		Shipping Address :<textarea cols="30" rows="3" name="Shipping_Address"></textarea>
		<br> Credit Card:
		<ul style="list-style: none">
			<li><input type="radio" name="Credit_Card" value="Visa">Visa</li>
			<li><input type="radio" name="Credit_Card" value="MasterCArd">MasterCArd</li>
			<li><input type="radio" name="Credit_Card"
				value="American Express">American Express</li>
			<li><input type="radio" name="Credit_Card" value="Discover">Discover</li>
			<li><input type="radio" name="Credit_Card"
				value="Java SmartCard">Java SmartCard</li>
		</ul>
		Credit Card Number : <input type="password" name="Credit_Card_Number"><br>
		Repeat Credit Card Number : <input type="password"
			name="ReCredit_Card_Number"><br>
		<p style="text-align: center">
			<input type="submit" value="Submit Order">
		</p>
	</form>
</body>
</html>