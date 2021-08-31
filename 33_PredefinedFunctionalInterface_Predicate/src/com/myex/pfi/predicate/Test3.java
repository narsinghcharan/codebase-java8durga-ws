//wap to check whether given number is greater than 10 or not.

package com.myex.pfi.predicate;

import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i>10;
		
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		//System.out.println(p.test("Narsingh"));
		
	}
	
}
