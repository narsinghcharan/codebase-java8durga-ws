//w.a.p to display sum of two numbers is even or not using "Predicate".

package com.myex.pj;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p = (a,b) -> (a+b)%2 == 0;
		
		System.out.println(p.test(2, 3));
		System.out.println(p.test(10, 20));
		
		
	}
}

/*
interface BiPredicate<T,U> {
	public boolean test(T t, U u);
}

*/