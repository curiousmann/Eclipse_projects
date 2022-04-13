<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.ust.dto.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Product</title>
</head>
<body>
<%

List<Product> li =(List<Product>)request.getAttribute("records");

out.println("Product Details are :  <br>");

//foreach jdk 1.5
for(Product p:li){
	out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice()+"<br>");
}



%>

</body>
</html>