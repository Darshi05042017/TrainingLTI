<%@page import="com.lti.training.employee.model.Employee"%>
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

Employee employees=(Employee)session.getAttribute("Employee");

%>>

EmpId : <%=employees.getEmpno() %><br/>
Ename: <%=employees.getEname() %><br/>
Mgr : <%=employees.getMgr() %><br/>
HireDate : <%=employees.getHiredate() %><br/>
Sal: <%=employees.getSalary() %><br/>
Comm : <%=employees.getComm() %><br/>
Deptno : <%=employees.getDeptno() %><br/>
=====================================================

</body>
</html>