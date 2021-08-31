//wap to take integer value and return its square using Function.

package com.myex.function;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = n -> n*n;
		
		System.out.println(f.apply(9));
		
		System.out.println(f.apply(7));
	}
}
