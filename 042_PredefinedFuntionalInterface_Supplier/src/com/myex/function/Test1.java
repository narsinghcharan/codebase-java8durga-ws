//wap to take String value and return its length using Function.

package com.myex.function;

import java.util.function.Supplier;

public class Test1 {

	public static void main(String[] args) {
		
		Supplier<String> splr = () -> {
			
			String[] str = {"Sunny" , "Bunny" , "Kiran" , "Prabha"};
			
			int x = (int)(Math.random()*3+1);
			
			return str[x];
		};
		
		System.out.println(splr.get());
		System.out.println(splr.get());
		System.out.println(splr.get());
		System.out.println(splr.get());
		
		
	}
}
