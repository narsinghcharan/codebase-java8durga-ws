//wap to take String value and return its length using Function.

package com.myex.function;

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {
		
		Function<String,Integer> f = s -> s.length();
		
		System.out.println(f.apply("Narsingh Charan"));
	}
}
