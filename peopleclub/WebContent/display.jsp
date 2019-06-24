<%@page import="com.lti.service.People"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<People> q=(List<People>)session.getAttribute("people");
for(People p:q)
{%>
<%=p.getId() %>
<%=p.getFname() %>
<%=p.getLname() %>
<%=p.getDob() %>
<%=p.getCity()%>
<%} %>

</body>
</html>