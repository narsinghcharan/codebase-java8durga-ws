package com.myex.sfe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sfe.pojo.Student;

public class StreamFilterApp1 {

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
		
		List<Student> studentListAgeLessThan30 = students.stream().filter(student -> student.getAge()<30).collect(Collectors.toList());

		List<Student> studentListAgeMoreThan30 = students.stream().filter(student -> student.getAge()>30).collect(Collectors.toList());

		List<Student> studentListAgeIs30 = students.stream().filter(student -> student.getAge()==30).collect(Collectors.toList());
		
		System.out.println("Studnents whose age are less than 30 : " + studentListAgeLessThan30);
		
		System.out.println("Studnents whose age are more than 30 : " + studentListAgeMoreThan30);
		
		System.out.println("Studnents whose age are 30 : " + studentListAgeIs30);
		
	}

}