//w.a.p to print sqaure of the given number using IntFunction

package com.myex.bf;

import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		UnaryOperator<Integer> f = i -> i*i;
		System.out.println(f.apply(5));
	}
}

/*
interface UnaryOperator<T> {
	public T apply(T t);	//here both input and return type are same type.
}


UnaryOperator is a functional interface same like "Function" functional interface.
we should go for UnaryOperator when the input type and return type is same then we
should not go for Function, rather go for UnaryOperator.



*/