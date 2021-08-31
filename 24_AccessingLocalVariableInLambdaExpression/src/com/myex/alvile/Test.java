package com.myex.alvile;

public class Test {

	int x = 10;
	
	public void m2() {
	
		int y = 20;
		
		Interf i = () -> {
						
				System.out.println(x);	//10			
				System.out.println(y);	//20
				
				x = 888;
				//y = 999;	//C.E. implicitly acts as a final so we can't change the value of local valiable which is used inside the Lambda Expression.
		};
		
		//y=999;		//C.E. implicitly acts as a final so we can't change the value of local valiable which is used inside the Lambda Expression.
		i.m1();
	}
	
	public static void main(String[] agrs) {
	
		Test t = new Test();
		t.m2();
	}

}
/*
note :- from Lambda Expression we can directly access the variable of enclosing class and local the variable of enclosing method.

note :- the local variables which are referenced/used/accessed inside Lambda Expression are acting as final variables whether we declare or not. means here variable "y" will act as final variable.

so any local variable which is accessed from Lambda Expression is always final.


note :- when we use local variable inside lambda expression then automatically it become final and we can't change the value. but if we don't use the local variable inside the Lambda Expression the it won’t become final.

it is same like "method local inner class".

*/