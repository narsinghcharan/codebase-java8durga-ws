package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitTest1 {

	public static void main(String[] args) {
		
		//The Stream min() method is used to select the minimum/smallest element in the Stream according to the Comparator used for comparing the elements.
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		Optional<Integer> minNumber = numbers.stream().min((i,j) -> i.compareTo(j));
		
		System.out.println(minNumber);
		
		//-------------------------------
		
		Optional<Integer> maxNumber = numbers.stream().max((i,j) -> i.compareTo(j));
		
		System.out.println(maxNumber);
	}
}

