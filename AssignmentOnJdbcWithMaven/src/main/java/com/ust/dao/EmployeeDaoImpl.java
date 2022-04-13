package com.ust.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class EmployeeDaoImpl {
	
	
	public static void main(String[] args) {
		try { 
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter the department number : ");
			int id=sc.nextInt();
			
			System.out.println(" enter the dep name ");
			String itNm=sc.next();
			
			System.out.println("enter the location");
			String pr = sc.next();
			
			//load or register the driver
			Class.forName("com.mysql.jdbc.Driver");
			//define the connection url for mysql database;
			String url="jdbc:mysql://localhost:3306/ust";
			String userName="root";
			String password="Gokul@123";
			
			//establish the connection between the java class and database
			Connection con =DriverManager.getConnection(url,userName,password);
			//creating PreparedStatment Object using con
			String query="insert into dept values(?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
		   pstmt.setInt(1,id);
		   pstmt.setString(2,itNm);
		    pstmt.setString(3,pr);
		   
			int iobj=pstmt.executeUpdate();
			
			if(iobj>0) {
				System.out.println("Record is inserted using PreparedStatement");
			}else {
				System.out.println("Record is not inserted");
			}
			
			pstmt.close();
			con.close();
			sc.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	}

