//w.a.p to print sqaure of the given number using IntFunction

package com.myex.bf;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		IntUnaryOperator f = i -> i*i;
		System.out.println(f.applyAsInt(5));
	}
}

/*
interface IntUnaryOperator {
	public int apply(int t);	//here both input and return type are same type which is int.
}

interface LongUnaryOperator {
	public long apply(long t);	//here both input and return type are same type which is long.
}

interface DoubleUnaryOperator {
	public double apply(double t);	//here both input and return type are same type which is double.
}

UnaryOperator is a functional interface same like "Function" functional interface.
we should go for UnaryOperator when the input type and return type is same then we
should not go for Function, rather go for UnaryOperator.



*/