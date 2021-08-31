//wap to check whether given string length is greater than 5 or not.

package com.myex.pfi.predicate;

import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		
		Predicate<String> p = s -> s.length()>5;
		
		System.out.println(p.test("Narsingh"));
		System.out.println(p.test("Babu"));
		
	}
	
}
