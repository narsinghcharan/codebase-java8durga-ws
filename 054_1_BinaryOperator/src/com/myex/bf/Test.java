//w.a.p to print sqaure of the given number using IntFunction

package com.myex.bf;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {

		BiFunction<String, String, String> f = (s1,s2) -> s1+s2;
		System.out.println(f.apply("Ram ", "Shayam"));
		
		
		BinaryOperator<String> b = (i,j) -> i+j;
		System.out.println(b.apply("Ram ","Shayam"));
	}
}

/*

interface BiFunction<T,U,R> {
	public R apply(T t, U u);	// here all inputs and return types are different then we should go for BiFunction
}

interface BinaryOperator<T> {
	public T apply(T t1,T t2);	//here all 2 inputs and return type are same type.
}


BinaryOperator is a functional interface same like "BiFunction" functional interface.
we should go for BinaryOperator when the 2 input type and return type is same then we
should not go for BiFunction, rather go for BinaryOperator.



*/