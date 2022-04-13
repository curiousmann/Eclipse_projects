<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management</title>
</head>
<body><br>

<center>
<h1 align="center">Book Management</h1>

<br>
<form action="addProduct" method="post">
<table border="2" style="text-align: center">
<tr><th>Title: </th><td><input type="text" name="pi"></td></tr>
<tr><th>Author: </th><td><input type="text" name="pn"></td></tr>
<tr><th>Price: </th><td><input type="text" name="pc"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="store"></td></tr>



</table>
</form>
<br>
<br>
<a href="index.jsp">Click Here To Go  Home Page</a>
</center>
</body>
</html>