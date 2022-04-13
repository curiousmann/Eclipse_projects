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



<h3>Book Details are : </h3>
<table border="2">
<tr><th>Id</th><th>Title</th><th>Author</th><th>Price</th><th>Action</th></tr>

<c:forEach var="p" items="${requestScope.records}">
<tr>
<td><c:out value="${p.getId()}"></c:out></td>
<td><c:out value="${p.getTitle()}"></c:out></td>
<td><c:out value="${p.getAuthor()}"></c:out></td>
<td><c:out value="${p.getPrice()}"></c:out></td>
<td><a href="delete.jsp">Delete</a></td>
</c:forEach>


</table>


<br>
<br>
<a href="index.jsp">Click Here To Go  Home Page</a>




</body>
</html>