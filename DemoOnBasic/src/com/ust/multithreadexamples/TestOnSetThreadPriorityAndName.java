package com.ust.multithreadexamples;

public class TestOnSetThreadPriorityAndName {
	
	public static void main(String[] args) {
		
		
		ExampleOnSetThreadPriorityAndName estpn = new ExampleOnSetThreadPriorityAndName();
		estpn.setPriority(1);
		estpn.start();
		System.out.println("mainTHread");
//		System.out.println("default priorty and name of child thread");
//		System.out.println("Name: "+estpn.getName());//Thread-0
//		System.out.println("prority: "+estpn.getPriority());//5
//		


		//setPriority() and setName()
		//estpn.setName("pawankalyan");
		
//		
//		System.out.println("After setting priorty and name of child thread");
//		System.out.println("Name: "+estpn.getName());//pawankalyan
		System.out.println("prority: "+estpn.getPriority());//6
//			
			
		
			
			System.out.println(Thread.currentThread());	
			//System.out.println(estpn.getPriority());
				//System.out.println(Thread.MAX_PRIORITY);
				
				
	
	}
}