package com.ust.streamex;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Test {

	public static void main(String[] args) {

		int[] arr= new int[]{1,2,3,4,5,6,7};	
		
		
		IntStream st =Arrays.stream(arr);
		
		List<Integer> li=st.boxed().collect(Collectors.toList());
		
		li.forEach(System.out::print);
	}
}
