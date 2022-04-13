package com.ust.set;

import java.util.*;
public class ExampleOnTreeSet1 {
	
public static void main(String[] args) {
		
		TreeSet  ts = new TreeSet();
		
		ts.add(10);
		ts.add(40);
		ts.add(60);
		ts.add(70);
		ts.add(5);
		ts.add(10);
		ts.add(10);
		//ts.add("10");//String
		
		System.out.println("No of elements are : "+ts.size());
		
		System.out.println(ts);//ascending order
		
		ts.remove(60);
		
		System.out.println("after remove : "+ts);
		
		System.out.println("displaying the elements using iterator");
		Iterator iobj =ts.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		System.out.println("displaying the elements using desecnding order descdendingiterator");
		Iterator i2=ts.descendingIterator();
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
}}
