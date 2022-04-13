package com.ust.exceptionexamples;

public class Ex1 {
public static void main(String[] args) {
try {
	System.out.println("ini");
	int a=10,b=0,c=a/b;
	System.out.println(c+" hi");
	System.out.println("rest");
} catch (Exception e) {
	System.out.println("invaled");
}	
}
}
