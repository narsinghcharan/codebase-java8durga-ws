package com.myex.wole.test;

import com.myex.wole.MyRunnable;

public class Test {

	public static void main(String[] args) {

		Runnable r = new MyRunnable();

		Thread t = new Thread(r);

		t.start();

		for (int i = 1; i <= 10; i++) {

			System.out.println("Main Thread");
		}

	}
}
