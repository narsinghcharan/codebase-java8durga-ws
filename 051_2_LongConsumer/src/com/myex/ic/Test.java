//w.a.p to print sqaure of the given number using IntConsumer

package com.myex.ic;

import java.util.function.LongConsumer;

public class Test {

	public static void main(String[] args) {

		LongConsumer f = i -> System.out.println(i*i);
		f.accept(5);
	}
}

/*
interface IntConsumer {
	public void accept(int n);	//this will always take 'int' as input
}

*/