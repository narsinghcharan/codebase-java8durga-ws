package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitTest1 {

	public static void main(String[] args) {
		
		//skip the first 5 elements and then get the rest of the even numbers
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		List<Integer> evenNumbers = numbers.stream().skip(5).filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
	}
}

/*
skip() skips the first n elements in the encounter order.
*/