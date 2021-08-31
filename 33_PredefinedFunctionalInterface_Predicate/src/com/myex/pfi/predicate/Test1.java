//wap to check whether given number is greater than 10 or not.

package com.myex.pfi.predicate;

public class Test1 {

	public boolean test(Integer i) {

		if(i > 10) {
			return true;
		} 
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Test1 t = new Test1();
		
		System.out.println(t.test(100));
		System.out.println(t.test(5));
	}
	
}
