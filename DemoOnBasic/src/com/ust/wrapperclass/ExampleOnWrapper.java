package com.ust.wrapperclass;

public class ExampleOnWrapper {

	public static void main(String[] args) {
			
			int i=10;
			String s="20";
			
			String s1 ="20.0";
			//String s="sda";
			//Converting Primitive Datatype into Object
			
			Integer iobj = new Integer(i);
			System.out.println(iobj);
			
			//converting StringObject into an IntegerObject.	
			Integer iobj1 =  new Integer(s);
			System.out.println(iobj1);
			
			Float f1 = new Float(s1);
			System.out.println(f1);
			
			int i1=Integer.parseInt(s);
			System.out.println("i1 is "+i1);
			
			float f2 = Float.parseFloat(s1);
			System.out.println("f2 is  : "+f2);
			
		}	
		
}
