package com.myex.alvile.case3;

interface Interf {
	
	public static void m1() {		//interface static method

	}
}

public class Test implements Interf{

	private static void m1() {		//static with private access modifier; valid but not overriding nor method hiding
									//bcoz interface static method does not available to its implementation class.
	}
	
}
