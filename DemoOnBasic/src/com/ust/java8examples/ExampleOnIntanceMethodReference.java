package com.ust.java8examples;

public class ExampleOnIntanceMethodReference {

	  public int addition(int x,int y) {
		  return x+y;
	  }
	
	
	public static void main(String[] args) {
		
		ExampleOnIntanceMethodReference eim = new ExampleOnIntanceMethodReference();
			
		MyInt  mi =eim::addition;
		
		int res=mi.getSum(30, 40);
		System.out.println("sum of two numbers is "+res);
		
	}
	  
}
