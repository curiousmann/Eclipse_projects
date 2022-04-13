package com.ust.java8examples;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(15);
		al.add(5);
		
		System.out.println("Object are : "+al);
		
		//filter the array list using stream 
		//check the object is divisible by 2
	
		List<Integer> li=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	   System.out.println("divisble by 2 is :"+li);
	     
	  //increment the existing object value into double.
	 //increment the existing object value into double.
	   
	    List<Integer> l2=al.stream().map(i->i*2).collect(Collectors.toList());
	   
	   System.out.println("increasing the existing value using map(double) : "+l2);
	   
	   //count no of elments in stream.
	     long  cn= al.stream().count();
	     System.out.println("it will count no of elements : "+cn);
	     
	   System.out.println("before sorted using stream");
	   System.out.println(al);
	   
	   List<Integer> slist =al.stream().sorted().collect(Collectors.toList());
	     System.out.println("after sorted using stream");
	     System.out.println(slist);
	          
      List<Integer> slist2 =al.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		     System.out.println("after sorted using stream in descending order");
		     System.out.println(slist2);
		     Integer minVal=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
			   System.out.println("min value is : "+minVal);  
			     
			   Integer maxVal=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
			   System.out.println("max value is : "+maxVal);     
			     
			   //printing using for each
			   System.out.println("printing the elements using stream forEach ");
			   al.stream().forEach(i->{
				   System.out.println("the elements are : "+i);
			   });
			   
			  //converting arraylist object into array using stream
			   
			  Object ob[]=al.stream().toArray();
			  System.out.println("displaying the elements using foreach --loop");    
		       for(Object a:ob) {
		    	   System.out.println(a);
		       }
			  //declaring and initilazing an array 
		       int arr[]= new int[] {10,30,60,40,50};
		       
		       //converting array into stream
		       Stream<int[]> st=Stream.of(arr);
		       
		    
		       
		       
		}
		
	}
