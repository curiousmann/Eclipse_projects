package com.ui;
import java.util.Scanner;
import com.bean.Product;
import com.utility.Shop;
public class UserInterface {

	public static void main(String[] args) {
		int crt=0,count;
		double totalBill;
		Shop shp = new Shop();
		System.out.println("Enter the number of products");
		Scanner sc = new Scanner(System.in);
		count=sc.nextInt();
		while (crt < count){
			Product pdt = new Product();
			System.out.println("Enter the product details\nEnter the product id:");
			pdt.setProductId(sc.nextInt());
			System.out.println("Enter the product name:");
			pdt.setProductName(sc.next());
			System.out.println("Enter the cost:");
			pdt.setCost(sc.nextDouble());
			System.out.println("Enter the quantity:");
			pdt.setQuatity(sc.nextInt());
			pdt.calculateDiscount();
			shp.addProduct(pdt);
			crt++;
			
		}
		sc.close();
		totalBill=shp.calculateTotalBill();
		System.out.println("Calculated Bill Amount:"+totalBill);
	}	
}
