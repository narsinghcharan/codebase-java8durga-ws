//wap to check whether given string length is greater than 5 or not.

package com.myex.pfi.predicate;

public class Test1 {

	public boolean test(String s) {

		if(s.length() > 5) {
			return true;
		} 
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Test1 t = new Test1();
		
		System.out.println(t.test("Narsingh"));
		System.out.println(t.test("Babu"));
	}
	
}
