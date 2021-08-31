package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstAndFindAnyTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		Optional<Integer> minNumber = numbers.stream().findAny();
		
		minNumber.ifPresent(System.out::println);
		
		//-------------------------------
		
		Optional<Integer> maxNumber = numbers.stream().findFirst();
		
		maxNumber.ifPresent(System.out::println);

	}
}

