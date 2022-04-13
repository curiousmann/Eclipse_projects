package com.ust;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExampleOnTest {

	@Test
	@Order(3)
	void testCase1() {
		System.out.println("we are in testCase1");
	}

	
	@Test
	@Order(2)
	void testCase2() {
		System.out.println("we are in testCase2");
	}
	
	
	@Test
	void testCase3() {
		System.out.println("we are in testCase3");
	}
	
	@Test
	@Order(1)
	void testCase4() {
		System.out.println("we are in testCase4");
	}
	
	
}
