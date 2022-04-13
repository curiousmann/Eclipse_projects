package com.ust.java8examples;

public class ExampleOnMethodReferene3 {

	public static int sumEvaluation(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		//static methodReference using class name for SAM(funtional interface)
		Ex5 e5=ExampleOnMethodReferene3::sumEvaluation;
		
		int sumres=e5.getSum(40,50);
		System.out.println("sum of two numbers is : "+sumres);
		
	}
	
}
