package com.ust.junit;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ExampleOnParameterizedTest {

	
	@ParameterizedTest()
	@ValueSource(ints = {1,4,5,7})
	public void testCase1(int a) {

		Assertions.assertTrue(a>0);
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"martin","johndoe","blake","scott"})
	public void testCase2(String s) {
        Assertions.assertTrue(s.length()>4);
	}
	
	
}
