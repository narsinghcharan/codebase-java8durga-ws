//w.a.p to calculate Monthly salary with Employee & TimeSheet object as input by using "BiFunction".

package com.myex.bf;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee(101,"Durga", 1500);
		TimeSheet t = new TimeSheet(101, 25);
		
		BiFunction<Employee,TimeSheet,Double> f = (emp,ts) -> emp.dailyWages*ts.days;
		
		System.out.println(f.apply(e, t));
		
	}
}

/*
interface BiFunction<T,U,R> {
	public R apply(T t, U u);
}

*/