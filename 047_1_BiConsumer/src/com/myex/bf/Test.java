//w.a.p to     by using "BiFunction".

package com.myex.bf;

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {

		BiConsumer<String, String> c = (s1,s2) -> System.out.println(s1+s2);
		
		c.accept("Ram ", "Laxman");
		
	}
}

/*
interface BiConsumer<T,U> {
	public void accept(T t, U u);
}

*/