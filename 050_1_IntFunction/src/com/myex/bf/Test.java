//w.a.p to print sqaure of the given number using IntFunction

package com.myex.bf;

import java.util.function.IntFunction;

public class Test {

	public static void main(String[] args) {

		IntFunction<Integer> f = i -> i*i;
		System.out.println(f.apply(5));
	}
}

/*
interface IntFunction<R> {
	public R apply(int n);	//this will always take 'int' as input
}

*/