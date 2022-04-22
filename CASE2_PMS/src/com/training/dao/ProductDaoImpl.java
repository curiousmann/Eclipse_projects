package com.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.training.bean.Product;
import com.training.util.DBUtil;

public class ProductDaoImpl implements ProductDao{

	@Override
	public int insertProduct(Product p) {

		Connection con = DBUtil.getConnectionForDatabase();
		Statement stmtObj;
		try {
			stmtObj = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query = "select * from product";
			ResultSet rs = stmtObj.executeQuery(query); // scroll-able result set
			  
			//insert a record 
			rs.moveToInsertRow();
			rs.updateInt(1,p.getPid());
			rs.updateString(2,p.getPname());
			rs.updateInt(3,p.getPid()); 
			rs.insertRow();
			rs.close();
			stmtObj.close();
			DBUtil.closeDatabaseConnection();
			return 0;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return 1;
		}
	}

	@Override
	public ArrayList<Product> listProductDetails() {

		Connection con = DBUtil.getConnectionForDatabase();
		Statement stmtObj;
		ArrayList<Product> arr=new ArrayList<Product>();
		try {
			stmtObj = con.createStatement();
			String query = "select * from product";

			ResultSet rs = stmtObj.executeQuery(query); // scroll-able result set

			while (rs.next()) 
				arr.add(new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3)));
			
			// close the objects
			rs.close();
			stmtObj.close();
			DBUtil.closeDatabaseConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}

}
