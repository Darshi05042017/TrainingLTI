<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

   String useragent=request.getHeader("user-agent");

%>
<h1><%= useragent %></h1>

<h2>Date is : <%= new Date() %></h2>

<% 
//response.setHeader("refresh", "1");
//response.setHeader("refresh","5;Url=http://www.google.co.in");

HttpServletResponse httpResponse = (HttpServletResponse) response;
httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0
httpResponse.setDateHeader("Expires", 0); // Proxies.
%>

</body>
</html>