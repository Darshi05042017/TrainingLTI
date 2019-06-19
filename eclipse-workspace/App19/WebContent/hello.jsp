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
<%		//scriptlet
String str="Helloo";
Date d=new Date(); 
%>
<h1><%=str %></h1>
<h2>Today's date is <%= d %></h2>

<center>
	<%
		for(int i=2;i<=8;i++){
	%>
			<font size="<%= i %>">Hello world</font><br>
	<% 
		}
	%>
</center>
</body>
</html>