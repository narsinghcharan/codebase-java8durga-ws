package com.myex.alvile;

public class Test implements Interf{
	
	
	@Override
	public void m1() {
		System.out.println("My Own Implementations....");
	}

	public static void main(String[] agrs) {
	
		Test t = new Test();
		t.m1();		//default method will be called....
		
		Interf i = new Test();
		i.m1();
	}

}
