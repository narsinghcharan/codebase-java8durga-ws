/*

*/
package com.myex.test1;

import java.util.stream.Stream;

public class StreamOfTest1 {
	
	public static void main(String[] args){
				
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		
		//s.forEach( i -> System.out.println(i));
		//or
		s.forEach(System.out::println);
	}
}
