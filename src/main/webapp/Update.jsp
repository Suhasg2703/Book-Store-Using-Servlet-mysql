<%@ page import = "com.js.dto.Book" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update your data</h1>
	<% Book b = (Book)request.getAttribute("book"); %>
	<form action="edit" method="get"> 
		ID        : <input type="number" name="id" value="<%= b.getId() %>" > <br><br> 
		BookName      : <input type="text" name="bookname"> <br><br>
		AuthorNmae    : <input type="text" name="authorname"> <br><br>
		NoOfPages  : <input type="number" name="noofpages"><br><br>
		Price    : <input type="number" name="price" value="<%= b.getPrice()%>"> <br><br>
		<input type="submit" value="update">
	</form>
</body>
</html>