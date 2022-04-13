package com.ust.java8examples;

public class ExampleOnLamda2 {

	public static void main(String[] args) {
		EX2 e2=(a,b)->System.out.println("sum is : "+(a+b));
		e2.sum(5, 7);
	}

}
