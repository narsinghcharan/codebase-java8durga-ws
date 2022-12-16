//w.a.p to print only even numbers from the given integer array using LongPredicate

package com.myex.bf;

import java.util.function.LongPredicate;

public class Test {

	public static void main(String[] args) {

		long[] arr = {0,5,10,15,20,25};
		
		LongPredicate p = i -> i%2 == 0;
		
		for(long n : arr) {
			if(p.test(n)) {
				System.out.println(n);
			}
		}
	}
}

/*
interface BiConsumer<T,U> {
	public void accept(T t, U u);
}

*/