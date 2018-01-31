<%@ page language="java" import="com.adarsh.Employee,com.adarsh.EmployeeCRUD, java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> list = new ArrayList<>();
list = (ArrayList<Employee>)request.getAttribute("empCRUD");

%>
<table border="5">
<tr>
<th>Emp Number</th>
<th>Emp Name</th>
<th>User Name</th>
<th>Password</th>
<th>Email</th>
<th>Phone Number</th>
<th colspan="2">Action</th>
</tr>

<tr>
<%for(Employee emp:list){ %>
<td><%= emp.getEno()%></td>
<td><%= emp.getEname()%></td>
<td><%= emp.getUsername()%></td>
<td><%= emp.getPassword()%></td>
<td><%= emp.getEmail()%></td>
<td><%= emp.getPhoneno()%></td>
<td><a href="EmpServlet?action=editEmployee&e_no=<%= emp.getEno()%>">Update</a></td>
<td><a href="EmpServlet?action=deleteEmp&e_no=<%= emp.getEno()%>">Delete</a></td>
<%} %>

</tr>

</table>
</body>
</html>