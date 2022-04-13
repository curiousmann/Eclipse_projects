package com.ust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ust.dto.Book;
import com.ust.util.DBUtils;



public class BookDaoImpl implements BookDao {

	@Override
	public int addProduct(Book p) {

		int count=0;

		try {//get the Connection Object From DBUtils
			Connection con= DBUtils.getDataBaseConnection();

			//creating PreparedStatement Object
			String query="insert into book(title,author,price) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setString(1,p.getTtl());
			pstmt.setString(2,p.getAthr());
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

	@Override
	public List<Book> listProduct() {
		// TODO Auto-generated method stub
		List<Book> li = new ArrayList<Book>();

		try {

			//get the connection
			Connection con = DBUtils.getDataBaseConnection();

			String query="select @globalVar:=@globalVar+1 id,tblColumns.*from (select @globalVar:=0) initializeGlobalVariable, book tblColumns;";
			Statement stmtObj = con.createStatement();

			ResultSet rs =stmtObj.executeQuery(query);

			while(rs.next()) {
				Book p1 = new Book();
				p1.setBid(rs.getInt(1));
				p1.setTtl(rs.getString(2));
				p1.setAthr(rs.getString(3));
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
	public int deleteBook(String id) {
		int count=0;

		try {//get the Connection Object From DBUtils
			Connection con= DBUtils.getDataBaseConnection();

			//creating PreparedStatement Object
			String query="delete from book where title=?";
			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setString(1,id);
			
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
