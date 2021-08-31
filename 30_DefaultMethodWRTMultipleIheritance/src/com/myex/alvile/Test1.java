package com.myex.alvile;

public class Test1 implements Left,Right{
	
	
	@Override
	public void m1() {
		System.out.println("My Own Implementations....");
	}

	public static void main(String[] agrs) {
	
		Test1 t = new Test1();
		t.m1();		//overriding method will be called.
	}

}
