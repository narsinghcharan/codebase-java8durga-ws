//w.a.p to print length of the given String using ToIntFunction

package com.myex.bf;

import java.util.function.IntToDoubleFunction;

public class Test {

	public static void main(String[] args) {

		IntToDoubleFunction f = i -> Math.sqrt(i);		// here input is int type and return type is double type
		System.out.println(f.applyAsDouble(10));
	}
}

/*
interface IntToDoubleFunction {
	public double applyAsInt(int n);
}

*/