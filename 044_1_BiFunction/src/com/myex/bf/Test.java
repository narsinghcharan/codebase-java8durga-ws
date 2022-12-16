//w.a.p to display sum of two numbers is even or not using "BiFunction".

package com.myex.bf;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> f = (a,b) -> a*b;
		
		System.out.println(f.apply(2, 3));
		System.out.println(f.apply(10, 20));
		
		
	}
}

/*
interface BiFunction<T,U,R> {
	public R apply(T t, U u);
}

*/