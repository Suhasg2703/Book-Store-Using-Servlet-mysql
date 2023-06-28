<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
   <h1>Enter Your Details</h1>
  
 <form action="save" method="post">
 ID       : <input type="text" name="id"><br><br>
 Name     : <input type="text" name="name"><br><br>
 Email    : <input type="email" name="email"><br><br>
 Password : <input type="password"  name="pwd"><br><br>
 Address  : <input type="text" name="add"><br><br>
 Pincode  : <input type="text"  name="pin"><br><br>
 Phone    : <input type="text" name="phone"><br><br>
 <input type="submit" value="Register">
 </form>
 
</body>
</html>