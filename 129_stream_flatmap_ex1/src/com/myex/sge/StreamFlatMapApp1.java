package com.myex.sge;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapApp1 {

	public static void main(String[] args) {

		//creating list of prime numbers
		List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);

		//creating list of even numbers
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

		//creating list of even numbers
		List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);
		
		
		List<List<Integer>> listOfListofInts = Arrays.asList(primeNumbers, evenNumbers, oddNumbers);
		// listOfListofInts = {{5, 7, 11,13},{2, 4, 6, 8},{1, 3, 5, 7, 9}};
		
		List<Integer> listofInts = listOfListofInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(listofInts);
		
		//or
		
		List<Integer> listofInts1 = listOfListofInts.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(listofInts1);
	}
}
