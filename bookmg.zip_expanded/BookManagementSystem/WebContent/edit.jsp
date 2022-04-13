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

<form action="editbook" method="post">
Title: <input type="text" name="pi"><br>
Author: <input type="text" name="pn"><br>
Price: <input type="text" name="pc"><br>

<input type="submit" value="save">

</form>

</body>
</html>