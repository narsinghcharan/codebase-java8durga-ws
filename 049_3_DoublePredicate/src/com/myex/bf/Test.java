//w.a.p to print only even numbers from the given integer array using DoublePredicate

package com.myex.bf;

import java.util.function.DoublePredicate;

public class Test {

	public static void main(String[] args) {

		double[] arr = {0,5,10,15,20,25};
		
		DoublePredicate p = i -> i%2 == 0;
		
		for(double n : arr) {
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