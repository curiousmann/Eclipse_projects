package com.ust.java8examples;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationExamples2 {
	public static void main(String[] args) throws IOException {

		// Array can also be a source of a Stream
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		streamOfArray.forEach(System.out::println);

		// creating from existing array or of a part of an array:
		System.out.println("converting array into stream");
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);

		System.out.println("elements from partial array to stream");
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		streamOfArrayPart.forEach(System.out::println);
		//streamOfArrayPart.forEach(s->System.out.println(s));
		
	}
}
