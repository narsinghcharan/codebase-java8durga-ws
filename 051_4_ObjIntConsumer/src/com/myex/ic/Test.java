//w.a.p to print sqaure of the given number using IntConsumer

package com.myex.ic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjIntConsumer;

public class Test {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		populate(l);
		
		ObjIntConsumer<Employee> c = (e,d) -> e.salary = e.salary + d;
		for(Employee e:l) {
			c.accept(e, 500);
		}
		
		for(Employee e:l) {
			System.out.println(e);
		}

	}
	
	public static void populate(List<Employee> l) {
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Sunny", 2000));
		l.add(new Employee("Bunny", 3000));
		l.add(new Employee("Chinny", 4000));
	}
}

/*
if Consumer is taking 2 param, where 1st param is object type and 2nd param is primitive type then we should use these
consumers.

*/

/*
interface ObjIntConsumer {
	public void accept(T t, int n);	//this will take first arg as Object type and second arg as'int' type as input
}

interface ObjLongConsumer {
	public void accept(T t, long n);	//this will take first arg as Object type and second arg as'int' type as input
}

interface ObjDoubleConsumer {
	public void accept(T t, double n);	//this will take first arg as Object type and second arg as'int' type as input
}
*/