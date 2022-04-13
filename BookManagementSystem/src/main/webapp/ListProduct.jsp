<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.ust.dto.Book"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management</title>
<h1 align="center"">Book Management</h1>
</head>
<body><center><br>



<%-- <%

List<Product> li =(List<Product>)request.getAttribute("records");

out.println("Product Details are :  <br>");

//foreach jdk 1.5
for(Product p:li){
	out.println(p.getBid()+" "+p.getTtl()+" "+p.getAthr()+" "+p.getPrice()+"<br>");
}



%> 
 --%>





 
<h3>Book Details</h3>
<table border="2">

<tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Actions</th></tr>

<c:forEach var="p" items="${requestScope.records}">
<tr>
<td><c:out value="${p.getBid()}"></c:out></td>
<td><c:out value="${p.getTtl()}"></c:out></td>
<td><c:out value="${p.getAthr()}"></c:out></td>
<td><c:out value="${p.getPrice()}"></c:out></td>
<td><a href="delbook?id=<c:out value='${p.getTtl()}' />">delete</a></td>
</tr>
</c:forEach>


</table>
<br>
<br>
<a href="index.jsp">Click Here To Go  Home Page</a>
</center>

</body>
</html>