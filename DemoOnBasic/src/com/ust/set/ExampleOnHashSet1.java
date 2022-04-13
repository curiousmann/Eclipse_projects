package com.ust.set;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet1 {

	public static void main(String[] args) {
		
       HashSet hs = new HashSet();
       
		hs.add(10);
		hs.add("smith");
		hs.add(true);
		hs.add('d');
		hs.add(24.0f);
		hs.add(30.0);
		hs.add(10);//duplicate
		hs.add(null);
		
		System.out.println("no of elements are : "+hs.size());
		
		System.out.println(hs);
//search an Object based on contains()
		System.out.println(hs.contains(null));//false
		System.out.println(hs.contains(10));//true
		
		System.out.println("displaying the elements using the iterator");
		 
		 Iterator iobj =hs.iterator();
		 while(iobj.hasNext()) {
			 System.out.println(iobj.next());
		 }
		
		 System.out.println("displaying the elements using forEach Lambda Function");
		 hs.forEach(h->System.out.println(h));
		 		
		 
		
	}
}
