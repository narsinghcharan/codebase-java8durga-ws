package com.myex.ivile;

public class Test {

	int x = 888;

	public void m2() {

		Interf i = () -> {

			int x = 111; // local variable of Lambda Expression.

			System.out.println(x); // 111
			System.out.println(this.x); // 888

		};
		i.m1();
	}

	public static void main(String[] agrs) {

		Test t = new Test();
		t.m2();
	}
}

/*
1) inside Lambda Expression we can not declare instance variables. 
2) The variable which is declared inside Lambda Expression is always acts as Local variable only. 
3) inside Lambda Expression "this" always referes to outer class variables only. but inside anonymous inner class this always referes inner class variables.

*/