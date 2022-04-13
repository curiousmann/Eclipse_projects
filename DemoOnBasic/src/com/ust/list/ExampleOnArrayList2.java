package com.ust.list;

import java.util.*;

public class ExampleOnArrayList2 {

	public static void main(String[] args) {

		 //<T> --Type Should be a wrapper classes
		ArrayList<String> al = new ArrayList<String>(); //similar type of data using generics

		al.add("hello");
		al.add("smith");
		al.add("laxmi");
		al.add("martin");
		al.add("john");
		al.add("smith");
		//al.add(10);
        al.add("10");
		System.out.println("elements from arraylist is : "+al);	
		System.out.println("No of objects stored in arraylist al is : "+al.size());
		
		System.out.println("displaying the elements using iterator : -");
		Iterator<String> iobj=al.iterator();
		
       while(iobj.hasNext()) {
    	   System.out.println(iobj.next());
       }
       //foreach-loop from jdk 1.5
       System.out.println("dipslaying the elements using foreach loop...!");
       for(String s:al) {
    	   System.out.println(s);
       }
       
       //using Java8 forEach --loop
       System.out.println("display the elements using forEach Lambda function");
       al.forEach((n)->System.out.println(n));
       

	}

}
