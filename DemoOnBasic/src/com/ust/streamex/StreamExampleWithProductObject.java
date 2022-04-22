package com.ust.streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleWithProductObject {

	static List<Product> li = new ArrayList<Product>();
	
	static void withOutStreamApi() {
		/*
		 * List<Float> pc = new ArrayList<Float>();
		 * 
		 * for(Product p:li) { if(p.getPrice()>25000) { pc.add(p.getPrice()); }
		 * 
		 * }		
		 * System.out.println("prices greater than 25000 are : "+pc);
     		pc.forEach(p->System.out.println(p));
		 */
		
		
		//filter the product price > 25000 and store into an ArrayList.
		List<Float> pc=li.stream().filter(p->p.getPrice()>25000).map(p->p.getPrice()).collect(Collectors.toList());
	   	
		System.out.println("Product Price Greater than 25000 are :");
		pc.forEach(System.out::println);		
	}
	
	static void summedAllProductPrice() {
		
		//li.stream().filter(p->p.getPrice()>25000).map(p->p.getPrice()).collect(Collectors.toList());
		Double t=li.stream().collect(Collectors.summingDouble(p->p.getPrice()));
			System.out.println("Total Product Prices are : "+t);

	}

	public static void main(String[] args) {
	
	   li.add(new Product(1,"Hp laptop",25000f));
	   li.add(new Product(2,"DEll Laptop",28000f));
	   li.add(new Product(3,"Sony",50000f));
	   li.add(new Product(4,"Apple",90000f));
	   li.add(new Product(5,"lenovo",24000f));
		
	   //System.out.println(li);	
	   //StreamExampleWithProductObject.withOutStreamApi();
	   StreamExampleWithProductObject.summedAllProductPrice();;
	   
	   Product pmax =li.stream().max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
	   System.out.println("maximum product price is : "+pmax.getPrice());
	   
	   Product pmix =li.stream().max((p1,p2)->p1.getPrice()>p2.getPrice()?-1:1).get();
	   System.out.println("maximum product price is : "+pmix.getPrice());
	}
}