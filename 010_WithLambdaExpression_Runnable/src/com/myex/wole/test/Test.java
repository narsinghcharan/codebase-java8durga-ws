package com.myex.wole.test;

public class Test {

	public static void main(String[] args) {

/*
		Thread t = new Thread( () -> {
			
			for (int i = 1; i <= 10; i++) {

				System.out.println("Child Thread");
			}
		} ) ;
*/
//or
		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {

				System.out.println("Child Thread");
			}
			
		};
		
		Thread t = new Thread(r);
		
		t.start();

		for (int i = 1; i <= 10; i++) {

			System.out.println("Main Thread");
		}

	}
}
