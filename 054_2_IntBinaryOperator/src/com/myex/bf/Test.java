//w.a.p to print sqaure of the given number using IntFunction

package com.myex.bf;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Test {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> f = (i,j) -> i+j;
		System.out.println(f.apply(30,80));
		
		
		IntBinaryOperator b = (i,j) -> i+i;
		System.out.println(b.applyAsInt(10,20));
	}
}

/*

interface BiFunction<T,U,R> {
	public R apply(T t, U u);	// here all inputs and return types are different then we should go for BiFunction
}


Primitive version of BinaryOperator :-

interface IntBinaryOperator {
	public int apply(int i,int j);	//here all 2 inputs and return type are same type.
}


interface LongBinaryOperator {
	public long apply(long i, long j);	//here all 2 inputs and return type are same type.
}

interface DoubleBinaryOperator {
	public double apply(double i, double j);	//here all 2 inputs and return type are same type.
}

BinaryOperator is a functional interface same like "BiFunction" functional interface.
we should go for BinaryOperator when the 2 input type and return type is same then we
should not go for BiFunction, rather go for BinaryOperator.



*/