//w.a.p to create Student object by taking name and rollno as input by using "BiFunction".

package com.myex.bf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		BiFunction<String,Integer,Student> f = (name,rollno) -> new Student(name,rollno);
		
		list.add(f.apply("Ram", 100));
		list.add(f.apply("Shayam", 200));
		list.add(f.apply("Shiva", 200));
		
		for(Student s : list) {
			System.out.println(s);
		}
		
		
	}
}

/*
interface BiFunction<T,U,R> {
	public R apply(T t, U u);
}

*/