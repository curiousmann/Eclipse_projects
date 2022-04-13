<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.ust.dto.Product"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%-- <%

List<Product> li =(List<Product>)request.getAttribute("records");

out.println("Product Details are :  <br>");

//foreach jdk 1.5
for(Product p:li){
	out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice()+"<br>");
}



%> --%>

<h3>Product Details are : </h3>
<table border="2">
<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th></tr>

<c:forEach var="p" items="${requestScope.records}">
<tr>
<td><c:out value="${p.getPid()}"></c:out></td>
<td><c:out value="${p.getPname()}"></c:out></td>
<td><c:out value="${p.getPrice()}"></c:out></td>
</c:forEach>


</table>

<br>
<br>
<a href="index.jsp">Click Here To Go  Home Page</a>




</body>
</html>