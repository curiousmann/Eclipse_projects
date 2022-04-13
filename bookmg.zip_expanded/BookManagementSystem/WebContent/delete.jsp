<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.ust.dto.Books"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="delbooks" method="post">

Enter the id of the book to delete: <input type="text" name="pc"><br>

<input type="submit" value="save">
<a href="index.jsp">Click here to go to home</a>

</form>
</body>
</html>