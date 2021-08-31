package com.myex.sfe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sfe.pojo.Student;

public class StreamSumApp1 {

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
		
		Integer sumOfAge1 = students.stream().mapToInt(student -> student.getAge()).sum();

		//if we want to typecast the list element into some other type, we can do that also using "longValue(),intValue(),doubleValue()"
		Long sumOfAge2 = students.stream().mapToLong(student -> student.getAge().longValue()).sum();

		Integer averageOfAge = students.stream().mapToInt(student -> student.getAge().intValue()).sum() / students.size();
		
		System.out.println("Sum Of Age : " + sumOfAge1);

		System.out.println("Sum Of Age : " + sumOfAge2);

		System.out.println("Average Of Age : " + averageOfAge);
		
	}
}