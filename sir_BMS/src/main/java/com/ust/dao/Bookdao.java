package com.ust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ust.bean.Book;


public class Bookdao {
	
	public void insertBook(Book book) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getMySqlDatabaseConnection();
		String q1 = "insert into books"+"(title,author,price)values"+"(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(q1);
		pstmt.setString(1,book.getTitle());
		pstmt.setString(2, book.getAuthor());
		pstmt.setFloat(3, book.getPrice());
		
	    pstmt.executeUpdate();	
	}
	
	public List<Book> listAllBooks() throws ClassNotFoundException, SQLException{
		Connection con = DBUtil.getMySqlDatabaseConnection();
		String q2 = "select * from books";
		List<Book> book = new ArrayList<>();
		PreparedStatement pstmt = con.prepareStatement(q2);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt(1);
			String title = rs.getString(2);
			String author = rs.getString(3);
			float price = rs.getFloat(4);
			book.add(new Book(id,title,author,price));
			
		}
		return book;	
	}
	
	public Book getBook(int id) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getMySqlDatabaseConnection();
		Book book=null;
		String q3 = "select * from books where id = ?";
		PreparedStatement pstmt = con.prepareStatement(q3);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String title = rs.getString("title");
			String author = rs.getString("author");
			float price = rs.getFloat("price");
			book= new Book(id,title,author,price);
		}
		return book;
	}
	
	
	
	public void updateBook(Book book) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getMySqlDatabaseConnection();
		String q4 = "update books set title=?,author=?,price=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(q4);
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getAuthor());
		pstmt.setFloat(3, book.getPrice());
		pstmt.setInt(4, book.getId());
	     pstmt.executeUpdate();
		
		
	}
	
	public void deleteBook(int id) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getMySqlDatabaseConnection();
		String q5 = "delete from books where id = ?";
		PreparedStatement pstmt = con.prepareStatement(q5);
		pstmt.setInt(1, id);
		 pstmt.executeUpdate();					
	}
	
	
	
	
	
	
	
}
