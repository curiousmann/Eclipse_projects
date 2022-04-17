package com.utility;

import java.util.ArrayList;
import com.bean.Product;

public class Shop {

	public Shop() {
		super();
		
	}
	
	ArrayList<Product> proList = new ArrayList<Product>();
	
	public ArrayList<Product> getProList() {
		return proList;
	}
	public void setProList(ArrayList<Product> proList) {
		this.proList=proList;
	}
	public void addProduct(Product pdt) {
		proList.add(pdt);
	}
	public double calculateTotalBill() {
		double totalAmount=0.0;
		if(proList==null)
			return -1;
		else {
			for(Product calc:proList) {
				totalAmount+=calc.getCost()*calc.getQuatity()-(calc.getCost()*calc.getQuatity()*calc.getDiscount()/100);
			}
		return totalAmount;
		}
		
		
	}
}
