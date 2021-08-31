package com.myex.test;

public class Test1 {

	public static void main(String[] args) {
		
		int a = 1;
		
		System.out.println("a : " + a);
		
		int b = result(a);
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

	private static int result(int a) {
		
		return ++a;
	}
}
