package com.test.streamsque;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEMployeeBasedOnAge {

	public static void main(String[] args) {
		  List<Employe> employe = new ArrayList<>();

		  employe.add(new Employe(1, "Rahul", 25));
		  employe.add(new Employe(2, "Amit", 40));
		  employe.add(new Employe(3, "Neha", 45));
		  employe.add(new Employe(4, "John", 50));
		  employe.add(new Employe(5, "Priya", 38));

	        List<Employe> filteredEmployees = employe.stream()
	                .filter(emp -> emp.age() > 35 && emp.age() <= 45)
	                .collect(Collectors.toList());

	        filteredEmployees.forEach(System.out::println);
	        
	        
	        
	        Map<Integer, List<Employe>> result =
	                employe.stream()
	                .filter(emp -> emp.age() > 35 && emp.age() <= 45)
	                .collect(Collectors.groupingBy(Employe::age));

	}

}


record Employe(int id ,String name,int age) {}