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
	<p>
	<h2>
		please insert your id , password<br>
		 (e.g id001,id002,id003,id004,id005);
	</h2>
	</p>
	<hr>
	<form action="/HomeworkMVC_3/home?action=logininfo"  method="post">
		ID : <input type="text" name="customer_id"><br /> 
		Password:<input	type="password" name="customer_pass"><br /> <input type="submit"
			value="press">
	</form>

</body>
</html>