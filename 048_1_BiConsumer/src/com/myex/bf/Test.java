//w.a.p to increment employee salary by using "BiConsumer".

package com.myex.bf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		
		BiFunction<String, Double, Employee> f = (name,salary) -> new Employee(name,salary);
		
		list.add(f.apply("Durga", 1000.0));
		list.add(f.apply("Sunny", 2000.0));
		list.add(f.apply("Bunny", 3000.0));
		list.add(f.apply("Chinny", 4000.0));
		
		BiConsumer<Employee,Double> c = (e,increment) -> e.salary = e.salary + increment;
		
		for(Employee e : list) {
			c.accept(e, 100.0);
		}
		
		for(Employee e : list) {
			System.out.println(e);
		}
	}
}

/*
interface BiConsumer<T,U> {
	public void accept(T t, U u);
}

*/