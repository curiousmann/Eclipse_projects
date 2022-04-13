<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Book Management Web Application</title>
            
        </head>

        <body style="background-color:#7fdb23">

            <header>
                
                    <div style="background-color: #7d1414;">
                        <h1 class="text-center" style="padding: 20px; text-align: center; color:cyan">Book Management</h1>
     
                    </div>

                    <ul 
                    class="navbar-nav">
                        
                    </ul>
               
            </header>
            <br>

            <div class="row">
               

                <div class="container">
                <table>
     			<tr>
     			
              <td>
              <div style="padding-right: 20px;">
              <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New Book</a>
              </div>
              </td>
        <div class="container">
       <td> <a href="<%=request.getContextPath()%>/list" class="nav-link"><b>List All Books</b></a></td>
                    </tr>
                    </table>
                    <h3 style="text-align: center;"><u>List of Books</u></h3>
                    <hr>
                    <div class="container text-left">

  
                    </div>
                    <br>
                    <table border="2px" cellpadding="5px" cellspacing="5px">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Title</th>
                                <th>Author</th>
                                <th>Price</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="book" items="${listBook}">

                                <tr>
                                    <td>
                                        <c:out value="${book.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${book.title}" />
                                    </td>
                                    <td>
                                        <c:out value="${book.author}" />
                                    </td>
                                    <td>
                                        <c:out value="${book.price}" />
                                    </td>
                                    <td><a href="edit?id=<c:out value='${book.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${book.id}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

        </html>