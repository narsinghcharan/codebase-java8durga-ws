package com.myex.sfe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sfe.pojo.Student;

public class StreamFilterApp2 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("Narsingh");
		names.add("Babu");
		names.add("Payari");
		names.add("Bhai");
		
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
		
		
		//filtering list of students based on given list of names.
		List<Student> studentList = students.stream().filter(student -> names.contains(student.getName())).collect(Collectors.toList());

		
		System.out.println("Studnents  : " + studentList);
		
	}

}