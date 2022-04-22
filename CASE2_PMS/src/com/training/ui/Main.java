package com.training.ui;

import java.util.ArrayList;
import java.util.Scanner;
import com.training.bean.Product;
import com.training.dao.ProductDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> arr=new ArrayList<Product>();
		ProductDaoImpl prod=new ProductDaoImpl();
		
		System.out.print("1-> Insert Product Details\n"
				+ "2-> Retrive Product Details\n"
				+ "3-> Exit Operation\n\n"
				+ "Enter the Choice : ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter Product ID : ");
			int pid =sc.nextInt();
			System.out.print("Enter Product Name : ");
			String pname=sc.next();
			System.out.print("Enter Product Price : ");
			Float price=sc.nextFloat();
			int sts_flag=prod.insertProduct(new Product(pid, pname, price));
			if(sts_flag==0)
				System.out.println("Successfully Inserted");
			else
				System.out.println("Insertion Failed");
			break;
		case 2:
			arr=prod.listProductDetails();
			System.out.println();
			arr.forEach(p->{
				System.out.println(p.getPid() + " " + p.getPname() + " " + p.getPrice());
			});
			break;
		default:
			break;
		}
		sc.close();
	}
}
