package com.ust.java8examples;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleWithProductObject {

static List<Product> li = new ArrayList<Product>();

static void withOutStreamApi() {
	List<Float> pc = new ArrayList<Float>();
	
	for(Product p:li) {
		if(p.getPrice()>25000) {
			pc.add(p.getPrice());
		}
		
	}	
	System.out.println("prices greater than 25000 are : "+pc);
 		pc.forEach(p->System.out.println(p));
}
static void withStreamApi() {
	
	/*List<Float> pc = new ArrayList<Float>();
	 * for(Product p:li) { if(p.getPrice()>25000) { pc.add(p.getPrice()); } }
	 * System.out.println("prices greater than 25000 are : "+pc);
	 * pc.forEach(p->System.out.println(p));
	 */
	
	//filter the product price > 25000 and store into an ArrayList.
	
	List<Float> pc=li.stream().filter(p->p.getPrice()>25000).map(p->p.getPrice()).collect(Collectors.toList());
   	
	System.out.println("Product Price Greate than 25000 are :");
	pc.forEach(System.out::println);
	
	
 		
}
static void summedAllProductPrice() {
	
	  double summedPrices= li.stream().collect(Collectors.summarizingDouble(p->p.getPrice())).getSum();
		System.out.println("total product cumlative price is :"+summedPrices);
		
	}



public static void main(String[] args) {
	
   li.add(new Product(1,"Hp laptop",25000f));
   li.add(new Product(2,"DEll Laptop",28000f));
   li.add(new Product(3,"Sony",50000f));
   li.add(new Product(4,"Apple",90000f));
   li.add(new Product(5,"lenovo",28000f));
	
   //System.out.println(li);	
   //StreamExampleWithProductObject.withOutStreamApi();
   //StreamExampleWithProductObject.withStreamApi();
   //StreamExampleWithProductObject.summedAllProductPrice();

   //get max productprice
   
 //get the min ProductPrice
   
	  Product pmin= li.stream().max((p1,p2)->p1.getPrice()<p2.getPrice()?1:0).get();
	   System.out.println("minimum product price is : "+pmin.getPrice());

	   
	   //from arraylist get the productid and ProductName and store into Map<id,Name> Object
	// Converting Product List into a Map
    Map < Integer, String > productPriceMap = li.stream()
        .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
    
    System.out.println(productPriceMap);

}
}
