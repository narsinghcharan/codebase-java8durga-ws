//wap to check whether given string length is greater than 5 or not.

package com.myex.pfi.predicate;

import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {

		Predicate<String> p = (String s) -> {

			if(s.length() > 5) {
				return true;
			} 
			else {
				return false;
			}
		};
		
		System.out.println(p.test("Narsingh"));
		System.out.println(p.test("Babu"));
	}
}
