package com.ust.java8examples;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreationExamples1 {
	public static void main(String[] args) throws IOException {

		Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring","Hibernate");
		Stream<String> stream2 = collection.stream();
		System.out.println("converting collection interface to Stream");
		stream2.forEach(System.out::println);

		
		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");

		Stream<String> stream3 = list.stream();
		System.out.println("converting List interface to Stream");
		stream3.forEach(System.out::println);

		Set<String> set = new HashSet<>(list);
		
		System.out.println("converting set interface to Stream");
		Stream<String> stream4 = set.stream();

		stream4.forEach(System.out::println);
		
		
	}
}
