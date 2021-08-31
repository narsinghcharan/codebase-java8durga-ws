package com.myex.alvile.case2;

interface Interf {
	
	public static void m1() {		//interface static method

	}
}

public class Test implements Interf {

	public void m1() {		//static method; valid but not overriding
							//bcoz interface static method does not available to its implementation class.
	}
	
}
