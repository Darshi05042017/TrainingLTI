<%@page import="java.util.List"%>
<%@page import="com.lti.exam.model.Option"%>
<%@page import="com.lti.exam.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Exam</title>
</head>
<body>
<form method="post" action="CalculateScoreServlet">
<%
Question q= (Question) session.getAttribute("currentQs");
%>
<h3> Q. <%= q.getQuestion() %></h3>

<h3><%
int opNo=0;
List<Option> ops=q.getOptions();
for(Option o :ops){ %></h3>
<input type="radio" name="op" value="<%= opNo++%>"/> <%= o.getOption() %><br/>
<%
}
%>
<input type="submit" value="Continue"/>

</form>

</body>
</html>