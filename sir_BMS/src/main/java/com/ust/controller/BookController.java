package com.ust.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.bean.Book;
import com.ust.dao.Bookdao;

@WebServlet("/")
public class BookController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
		Bookdao user = new Bookdao(); 
		
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String action = req.getServletPath();

        switch (action) {
            case "/new": showNewBook(req, resp);
                            break;
            case "/insert": try {
				insertBook(req, resp);
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
                                 break;
            case "/delete":try {
				deleteBook(req, resp);
			} catch (ClassNotFoundException | SQLException | IOException e) {

				e.printStackTrace();
			}
                                break;
            case "/edit": try {
				showEditBook(req, resp);
			} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {

				e.printStackTrace();
			}
                              break;
            case "/update": try {
				updateBook(req, resp);
			} catch (ClassNotFoundException | SQLException | IOException e) {

				e.printStackTrace();
			}
                              break;
            default:try {
				listBook(req, resp);
			} catch (ClassNotFoundException | SQLException | IOException | ServletException e) {

				e.printStackTrace();
			}
                          break;
        }
}

private void listBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException, ClassNotFoundException {
    List<Book> listBook = user.listAllBooks();
    request.setAttribute("listBook", listBook);
    RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
    dispatcher.forward(request, response);
}

private void showNewBook(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
    dispatcher.forward(request, response);
}

private void showEditBook(HttpServletRequest request, HttpServletResponse response)
throws SQLException, ServletException, IOException, ClassNotFoundException {
    int id = Integer.parseInt(request.getParameter("id"));
    System.out.println("We are in showEditBook"+id);
    Book existingBook = user.getBook(id);
    request.setAttribute("book",existingBook);
    RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp"); 
    dispatcher.forward(request, response);

}

private void insertBook(HttpServletRequest request, HttpServletResponse response)
throws SQLException, IOException, ClassNotFoundException {
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    float price = Float.parseFloat(request.getParameter("price"));
    Book newBook = new Book(title, author, price);
    user.insertBook(newBook);
    response.sendRedirect("list");
}

private void updateBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ClassNotFoundException {
	int id = Integer.parseInt(request.getParameter("id"));
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    float price = Float.parseFloat(request.getParameter("price"));
    
    System.out.println("Before"+id);
    Book book = new Book(id,title,author,price);
    user.updateBook(book);
    response.sendRedirect("list");

}

private void deleteBook(HttpServletRequest request, HttpServletResponse response)
throws SQLException, IOException, ClassNotFoundException {
    int id = Integer.parseInt(request.getParameter("id"));
    user.deleteBook(id);
    response.sendRedirect("list");

}

	}
	