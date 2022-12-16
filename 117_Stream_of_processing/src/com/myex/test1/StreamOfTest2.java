/*

*/
package com.myex.test1;

import java.util.stream.Stream;

public class StreamOfTest2 {
	
	public static void main(String[] args){
				
		Double[] d =  {10.1, 10.2, 10.3, 10.4, 10.5, 10.6};
		
		Stream<Double> s = Stream.of(d);
		
		//s.forEach( i -> System.out.println(i) );
		//or
		s.forEach( System.out :: println );
	}
}
