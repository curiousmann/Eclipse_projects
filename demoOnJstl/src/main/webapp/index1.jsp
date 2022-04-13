<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'welcome to JSTL(jsp standard TagLibrary)'}"></c:out>
<br>
<c:out value="${'helloworld'}" />
<br>

<%--   c:set tag to declare variable and inject into any scoped 
attribute(session,reques,appplication) --%>
<c:set var="in" scope="session" value="${4*4}"></c:set>
<c:out value="${in}"></c:out>

<%-- c:remove tag is to remove object from any session,application,request scope --%>
<br>
<c:set var="un" scope="session" value="${'smith'}"></c:set>
Before remove :<c:out value="${un}"></c:out> <br>
<c:remove var="un"/>
After remove :<c:out value="${un}"></c:out> <br>

<%-- c:if tag is to test the condition ,if expression is true it will the statement --%>
<c:set var="a" value="30"></c:set>
<c:set var="b" value="10"></c:set>

<br>

<c:if test="${a > b}">
<c:out value="${'a is greater than b'}"></c:out>
</c:if>

<%-- <c:catch> tag catches the exception that occur in program body  --%>
<br>
<c:catch var="handleTheException">

<% int y=10/0; %>

</c:catch>
<br>
<c:if test="${handleTheException!=null}">

Exception occured is : <c:out value="${handleTheException}"></c:out><br>
Message : <c:out value="${handleTheException.message}"></c:out>

</c:if>

<%--<c:when> and <c:otherwise> is similar to if-else-if but it must be placed in <c:choose> --%>
<br>
<c:set var="a" value="30"></c:set>
<c:set var="b" value="40"></c:set>
<c:set var="c" value="20"></c:set>
<br>
<c:choose>
<c:when test="${a>b && a>c}">
  <c:out value="${'a is greater than b,c'}"></c:out>
</c:when>

<c:when test="${b>c && b>a}">
  <c:out value="${'b is greater than a,c'}"></c:out>
</c:when>

<c:otherwise>
  <c:out value="${'c is greater than a,b'}"></c:out>
</c:otherwise>

</c:choose>

<%--
<c:forech> tag is alternative to while,do-while or for-loop using a scriptlet
The <c:foreach> tag is most commonly used tag because it iterates over a collection object
 --%>
 <br>
 
<c:forEach var="i" begin="1" end="5">
 <p>No is <c:out value="${i}"></c:out><p>

</c:forEach>


<%--
<c:forTokens>tag is used to convert the line into workds(tokens) based on delimiter
 --%>

Word Tokens are :
<br>
<c:forTokens items="hello#world#working#with#jstl" delims="#" var="wd">
<c:out value="${wd}"></c:out><br>

</c:forTokens>

<%--
<c:redirect> it will redirect to another page 
 --%>

<c:redirect url="https://www.facebook.com/"></c:redirect>



</body>
</html>