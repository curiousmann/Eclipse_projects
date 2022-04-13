package com.ust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ust.dto.Product;
import com.ust.util.DBUtils;



public class ProductDaoImpl implements ProductDao {

	@Override
	public int addProduct(Product p) {

		int count=0;

		try {//get the Connection Object From DBUtils
			Connection con= DBUtils.getDataBaseConnection();

			//creating PreparedStatement Object
			String query="insert into product values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);

			pstmt.setInt(1,p.getPid());
			pstmt.setString(2,p.getPname());
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
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		List<Product> li = new ArrayList<Product>();

		try {

			//get the connection
			Connection con = DBUtils.getDataBaseConnection();

			String query="select * from product";
			Statement stmtObj = con.createStatement();

			ResultSet rs =stmtObj.executeQuery(query);

			while(rs.next()) {
				Product p1 = new Product();
				p1.setPid(rs.getInt(1));
				p1.setPname(rs.getString(2));
				p1.setPrice(rs.getFloat(3));

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

	
}
