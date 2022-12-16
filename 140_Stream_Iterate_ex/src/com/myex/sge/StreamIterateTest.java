package com.myex.sge;

import java.util.stream.Stream;

public class StreamIterateTest {

	public static void main(String[] args) {
		
		//Stream.iterate(initial value, next value)
		Stream.iterate(5, n-> n+1).limit(10).forEach(System.out::println);
		
		System.out.println("-------------------------------");
		//print 10 even numbers
		Stream.iterate(0, n->n+1).filter(n->n%2==0).limit(10).forEach(System.out::println);
		
		System.out.println("-------------------------------");
		//print 10 odd numbers
		Stream.iterate(0, n -> n+1).filter(n -> n%2 != 0).limit(10).forEach(System.out::println);
		
		//note:- if I don't use limit() then it will go up to infinite.
	}
}

/*
we can use Stream.iterate() to create stream values on demand, so called infinite stream.

*/
