package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingUnboxing {

	public static void main(String[] args) {

		/*
		There're times when we need to convert primitive values to their wrapper equivalents.

		In those cases, we can use the boxed() method:
		*/
		List<Integer> numbers1 = IntStream.range(1, 10).boxed().collect(Collectors.toList());
		System.out.println(numbers1);
		
		System.out.println("---------------------");
		
		//We can also convert from the wrapper class stream to the primitive stream:
		
		int sum = Arrays.asList(20, 98)
				  .stream()
				  .mapToInt(i -> i)
				  .sum();
		
	}
}

/*
 * we can use Stream.iterate() to create stream values on demand, so called
 * infinite stream.
 * 
 */