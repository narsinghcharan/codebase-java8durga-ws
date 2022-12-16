package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

public class StreamForEachApp2 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1,"Narsingh",29));
		students.add(new Student(2,"Charan",28));
		students.add(new Student(3,"Babu",20));
		students.add(new Student(4,"Santosh",30));
		students.add(new Student(5,"Nath",27));
		students.add(new Student(6,"Charan",28));
		students.add(new Student(7,"Payari",32));
		students.add(new Student(8,"Kuni",31));
		students.add(new Student(9,"Santuni",30));
		students.add(new Student(10,"Bhai",29));
		
		//making list of name from the given list of student list
		List<String> names = new ArrayList<>();
		students.forEach(student -> names.add(student.getName()));
		System.out.println(names);
		
		
		//we can do the above things in this way also.
		List<String> names1 = students.stream().map(Student::getName).distinct().collect(Collectors.toList());
		
		System.out.println(names1);
		
	}
}
