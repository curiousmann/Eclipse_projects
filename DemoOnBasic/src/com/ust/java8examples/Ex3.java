package com.ust.java8examples;
@FunctionalInterface
public interface Ex3 {

		public String getMessage();//SAM
		
		default void methodOne() {
			System.out.println("we are in methodOne default");
		}
		
		static void methodTwo() {
		System.out.println("we are in methodTwo of static");
		}

}
