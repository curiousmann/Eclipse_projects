package com.training.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnUpdate {
	
	public static void main(String[] args) {

		
		try { 
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter the deptno to update");
			int dno=sc.nextInt();
			
			System.out.println("enter the new deptName ");
			String dna=sc.next();
			
			System.out.println("enter the new loc");
			String dl=sc.next();
			
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//define the connection url for mysql database;
			String url="jdbc:mysql://localhost:3306/ust";
			String userName="root";
			String password="root";
			
			//establish the connection between the java class and database
			Connection con =DriverManager.getConnection(url,userName,password);
			//creating PreparedStatment Object using con
			String query="update dept_1 set dname=?,loc=? where deptno=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1,dna);
			pstmt.setString(2,dl);
			pstmt.setInt(3,dno);
			
		   
			int iobj=pstmt.executeUpdate();
			
			if(iobj>0) {
				System.out.println("Record is updatd : "+iobj);
			}else {
				System.out.println("Record is not updated ");
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
