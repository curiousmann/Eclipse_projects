<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:setDataSource  var="ds"
   driver="com.mysql.cj.jdbc.Driver"
   url="jdbc:mysql://localhost:3306/ust"
   user="root"
   password="root"/>
   
<%-- Select the data from the product table--%>
 
 <sql:query dataSource="${ds}" var="rs">
  select * from product;
 </sql:query>

 
 <h3>ProductDetails are :</h3>

<table border=2pxs>
 <tr><th>productId</th>
 <th>productName</th>
 <th>productPrice</th></tr>
 
 <c:forEach var="p" items="${rs.rows}">
 <tr>
 <td><c:out value="${p.pid}"></c:out></td>
 <td><c:out value="${p.pname}"></c:out></td>
 <td><c:out value="${p.price}"></c:out></td>
 </tr>
 </c:forEach>
 </table>
