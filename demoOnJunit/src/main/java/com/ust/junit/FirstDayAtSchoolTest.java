package com.ust.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FirstDayAtSchoolTest {

	FirstDayAtSchool fdas;
	
	@BeforeEach
	public void setUp() {
		fdas=new FirstDayAtSchool();
	}
	

	@Test
	public void testPrepareMyBag() {
		
		String actualOutput[]=fdas.prepareMyBag();	
		String expectedOutput[]= {"Books", "Notebooks", "Pens"};
		Assertions.assertArrayEquals(expectedOutput,actualOutput);
	}
	
	
	
}
