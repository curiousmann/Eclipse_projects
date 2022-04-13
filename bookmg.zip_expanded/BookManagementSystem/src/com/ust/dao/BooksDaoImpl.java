package com.ust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ust.dto.Books;
import com.ust.util.DBUtils;



public class BooksDaoImpl implements BooksDao {

	@Override
	public int addBook(Books p) {

		int count=0;

		try {//get the Connection Object From DBUtils
			Connection con= DBUtils.getDataBaseConnection();

			//creating PreparedStatement Object
			String query="insert into book values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setInt(1,p.getId());
			pstmt.setString(2,p.getTitle());
			pstmt.setString(3,p.getAuthor());
			pstmt.setFloat(4,p.getPrice());


			count=pstmt.executeUpdate();

			pstmt.close();
			DBUtils.closeConnection();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public List<Books> listBooks() {
		// TODO Auto-generated method stub
		List<Books> li = new ArrayList<Books>();

		try {

			//get the connection
			Connection con = DBUtils.getDataBaseConnection();

			String query="select * from book";
			Statement stmtObj = con.createStatement();

			ResultSet rs =stmtObj.executeQuery(query);

			while(rs.next()) {
				Books p1 = new Books();
				p1.setId(rs.getInt(1));
				p1.setTitle(rs.getString(2));
				p1.setAuthor(rs.getString(3));
				p1.setPrice(rs.getFloat(4));

				li.add(p1);
			}

			rs.close();
			stmtObj.close();
			DBUtils.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return li;
	}
	@Override
	public void deletebookById(int id) {
		
		try {
			Connection con = DBUtils.getDataBaseConnection();
			
			String quer="delete from book where book_id="+id+"";
			Statement stmtObj;
			stmtObj = con.createStatement();
			boolean i=stmtObj.execute(quer);
			if(i==true) {
			System.out.println(" book not found");
			}
			else {
				System.out.println("book is deleted");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public int editBook(int id) {

		int count=0;

		try {//get the Connection Object From DBUtils
			Connection con= DBUtils.getDataBaseConnection();
			Books p=new Books();
			//creating PreparedStatement Object
			String query="update book set title=? ,author=?,price=? where book_id=id";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,p.getTitle());
			pstmt.setString(2,p.getAuthor());
			pstmt.setFloat(3,p.getPrice());


			count=pstmt.executeUpdate();

			pstmt.close();
			DBUtils.closeConnection();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}


	
}
