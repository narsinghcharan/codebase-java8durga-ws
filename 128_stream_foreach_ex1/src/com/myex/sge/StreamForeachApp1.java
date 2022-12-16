package com.myex.sge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.myex.sge.pojo.Student;

public class StreamForeachApp1 {

	public static void main(String[] args) {

		List<Integer> ids = Arrays.asList(1,3,5,7);
		
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
		
		Iterator<Student> studentIterator = students.iterator();
		 
		while(studentIterator.hasNext()) {
		    
			Student s = studentIterator.next();
			
			if(!ids.contains(s.getId())) {
				studentIterator.remove();
			}
			
		}
		
		
		
		System.out.println(students);
		
	}
}
