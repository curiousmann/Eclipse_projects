package com.ust;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class ExampleOnTest2 {

	@Test
	public void testZ() {
		assertEquals(2,1+1);
	}
	
	@Test
	public void testz1() {
		assertEquals(6,2*3);
	}
	
	@Test
	public void testA1() {
		assertEquals(2,10/5);
		System.out.println("we are method testA");
	}
	
	@Test
	public void testa() {
		assertEquals(2,10/5);
		System.out.println("we are method testA");
	}
	
	
	
}
