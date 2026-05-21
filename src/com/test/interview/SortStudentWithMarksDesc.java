package com.test.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStudentWithMarksDesc {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("A1",60),new Student("A2",70),new Student("A3",50),new Student("A4",80),new Student("A5",40));
               list.stream()
               .sorted(Comparator.comparingInt(Student::marks).reversed())
               .forEach(e-> System.out.println(e.name() + "->"+ e.marks()));
	
             
	}

}



record Student(String name , int marks) {}