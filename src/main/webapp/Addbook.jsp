<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>Enter book details</h1>
  <form action="savebook" method="post">
 ID       : <input type="text"  name="id"><br><br>
 Name     : <input type="text" name="name"><br><br>
 Author    : <input type="text" name="author"><br><br>
 Pages : <input type="text"  name="pages"><br><br>
 Price  : <input type="text" name="price"><br><br> 
 <input type="submit" value="add book">
  </form>
</body>
</html>