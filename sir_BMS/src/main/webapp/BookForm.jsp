<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Book Management Application</title>
            
        </head>

        <body style="background-color:#7fdb23">

            <header>
                <style="background-color:red">
                     <b style= color:#0c0fab>Book Management App</b>

                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${book != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${book == null}">
                            <form action="insert" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${book != null}">
                                    Edit Book
                                </c:if>
                                <c:if test="${book == null}">
                                    Add New Book
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${book != null}">
                            <input type="hidden" name="id" value="<c:out value='${book.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Book Title</label> <input type="text" value="<c:out value='${book.title}' />" class="form-control" name="title" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Book Author</label> <input type="text" value="<c:out value='${book.author}' />" class="form-control" name="author">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Book Price</label> <input type="text" value="<c:out value='${book.price}' />" class="form-control" name="price">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>