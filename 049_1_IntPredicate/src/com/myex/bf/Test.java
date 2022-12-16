//w.a.p to print only even numbers from the given integer array using IntPredicate

package com.myex.bf;

import java.util.function.IntPredicate;

public class Test {

	public static void main(String[] args) {

		int[] arr = {0,5,10,15,20,25};
		
		IntPredicate p = i -> i%2 == 0;
		
		for(int n : arr) {
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