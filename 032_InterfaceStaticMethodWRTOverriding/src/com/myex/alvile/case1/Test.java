package com.myex.alvile.case1;

interface Interf {
	
	public static void m1() {		//interface static method

	}
}

public class Test implements Interf{

	public static void m1() {		//static public method; valid but not overriding nor method hiding
									//bcoz interface static method does not available to its implementation class.
	}
	
}

