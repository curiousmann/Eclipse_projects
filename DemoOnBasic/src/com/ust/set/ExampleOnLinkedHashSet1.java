package com.ust.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleOnLinkedHashSet1 {


	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		LinkedHashSet<Comparable> lhs = new LinkedHashSet<Comparable>();
		
		lhs.add("smith");
		lhs.add(10);
		lhs.add(true);
		lhs.add(30.0f);
		lhs.add(null);
		lhs.add(10);
		lhs.add('a');
		
		System.out.println("no of  elements are : "+lhs.size());
		System.out.println(lhs);
		
		//removing an element based On Object
		lhs.remove(true);
		System.out.println("after remove ");
		System.out.println(lhs);
		
		System.out.println("displaying the elements using iterator");
		@SuppressWarnings("rawtypes")
		Iterator<Comparable> iobj=lhs.iterator();
while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		System.out.println("displaying the elements using forEach");
		lhs.forEach(lh->System.out.println(lh));
		
		
		
	}
	
}
