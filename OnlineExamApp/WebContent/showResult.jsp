<%@page import="com.lti.exam.servlet.CalculateScoreServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
  Your score is:<%=session.getAttribute("score")%>
  

</body>
</html>