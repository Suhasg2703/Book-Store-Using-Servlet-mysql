<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <% String s = (String)request.getAttribute("msg"); %>
   <h1><%= s %></h1>
   
   <h3><a href="Welcome.jsp">Home</a></h3>
</body>
</html>