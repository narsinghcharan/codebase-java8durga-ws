package com.myex.sge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * https://www.baeldung.com/java-streams-peek-api
 * 
 * peek() is an Intermediate operation.
 * 
 * All intermediate operations are lazy, and, as a result, no operations will have any effect until the pipeline starts to work.
 * 
 * Terminal operations mean the end of the stream lifecycle. Most importantly for our scenario, they initiate the work in the pipeline.
 * 
 * 
 */
public class StreamFlatMapApp1 {


	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Babu", "Charan", "Narsingh");
		
		stream.peek(System.out::print);		//won't print anything
		
		/*
		 * as peek() is an intermediate operation so it won't run because these type of operations are lazy, until we are using
		 * terminal operation these intermediate operation will not work.
		 */
		
		
		Stream<String> stream1 = Stream.of("Babu", "Charan", "Narsingh");
		
		List<String> names = stream1.peek(s -> System.out.println(s + " ")).filter(s -> s.length()>4).collect(Collectors.toList());
		
		System.out.println("Filtered names : " + names);
	}
}
