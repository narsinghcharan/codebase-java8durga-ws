//wap to take String value and return its length using Function.

package com.myex.function;

import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Narsingh Charan");
		
	}
}
