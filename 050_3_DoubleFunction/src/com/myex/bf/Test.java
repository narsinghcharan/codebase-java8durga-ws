//w.a.p to print sqaure of the given number using DoubleFunction

package com.myex.bf;

import java.util.function.DoubleFunction;

public class Test {

	public static void main(String[] args) {

		DoubleFunction<Double> f = i -> i*i;		// the the type parameter talks about the return type of apply() method
		System.out.println(f.apply(5));
	}
}

/*
interface DoubleFunction<R> {
	public R apply(int n);
}

*/