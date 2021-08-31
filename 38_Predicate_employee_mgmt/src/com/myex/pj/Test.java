//w.a.p for user authentication using "Predicate".

package com.myex.pj;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
	
		List<Employee> employees = new ArrayList<Employee>();
		populate(employees);
		
		Predicate<Employee> p1 = employee -> employee.designation.equalsIgnoreCase("Manager");
	
		Predicate<Employee> p2 = employee -> employee.city.equalsIgnoreCase("Bangalore");
		
		Predicate<Employee> p3 = employee -> employee.salary < 20000;
		
		Predicate<Employee> isVP = Predicate.isEqual(new Employee("Narsingh", "VP", 90909900, "Hyd"));	//to understand this check next application
		// here to work with "isEqual" we have to override "equals()" method.
		
		// displaying all those employee whose designation is Manager
		display(p1,employees);

		System.out.println("**************************************");
		
		// displaying all those employee whose city is Bangalore
		display(p2,employees);

		System.out.println("**************************************");

		// displaying all those employee whose salary is less than 20000
		display(p3,employees);

		System.out.println("**************************************");
		
		// displaying all those employee whose location is Bangalore and Designation is Manager
		display(p1.and(p2),employees);

		System.out.println("**************************************");
		
		// displaying all those employee whose location is Bangalore or Designation is Manager
		display(p1.or(p2),employees);

		System.out.println("**************************************");
		
		// displaying all those employee whose Designation is not Manager
		display(p1.negate(),employees);

		System.out.println("**************************************");
		
		//if we want to check whether the provided object and the predicate holding object is equal or not, we should go for this. 
		System.out.println( isVP.test(new Employee("Narsingh", "VP", 90909900, "Hyd")) );

	}

	private static void display(Predicate<Employee> p1, List<Employee> employees) {
		
		for(Employee emp : employees) {
			if(p1.test(emp)) {
				System.out.println(emp);
			}
		}
		
	}

	private static void populate(List<Employee> employees) {

		employees.add(new Employee("Narsingh", "VP", 90909900, "Hyd"));
		employees.add(new Employee("Charan", "Senior Software Engineer", 9090990, "Bangalore"));
		employees.add(new Employee("Babu", "MD", 9090990, "Kerala"));
		employees.add(new Employee("Nath", "Consultant", 9090990, "Bangalore"));
		employees.add(new Employee("Chhottu", "Associate Java Devveloper", 9090990, "Bangalore"));
		employees.add(new Employee("Shashi", "Senior Manager", 19000, "Bangalore"));
		employees.add(new Employee("Saurya", "Assosiate Manager", 9090990, "Bangalore"));
		employees.add(new Employee("Binay", "Manager", 9090990, "Bangalore"));
		employees.add(new Employee("Santosh", "Developer", 9090990, "Bangalore"));

	}
}
