package com.myex.sge;

import java.util.stream.IntStream;

public class PrimeNumberTest {

	public static void main(String[] args) {

		System.out.println(isPrime1(-2));
		
	}
	
	private static Boolean isPrime(int n) {
		
		return !IntStream.rangeClosed(2, n/2).anyMatch(i -> n%i == 0);
	}
	
	//or
	
	private static Boolean isPrime1(int n) {			//this is the correct one
		
		return n>1 && IntStream.rangeClosed(2, n/2).noneMatch(i -> n%i == 0);
	}
}

/*
 * we can use Stream.iterate() to create stream values on demand, so called
 * infinite stream.
 * 
 */