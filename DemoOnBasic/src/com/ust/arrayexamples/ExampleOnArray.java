package com.ust.arrayexamples;

public class ExampleOnArray {

	public static void main(String[] args) {
		int a[]= {10,20,40,69,64};
		System.out.println(a);
		for(int i=0;i<5;i++)
			System.out.println(a[i]);
		
		for(int ar:a)
			System.out.println(ar);
	}
}
