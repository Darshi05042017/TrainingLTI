<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>${ message }</b>
<form method="post" action="login.lti">
	Enter Username <input type="text" name="username" /><br/>
	Enter Password <input type="password" name="password" /><br/>
	<button type="submit">Login</button>
	</form>
	</body>
</html>