package com.test.streamsque;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEmployeeWithMaxSallary {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
                new Employee(1, "A", 50000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 60000)
        );
		
	Employee employee = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
	System.out.println(employee.getName() +"->"+ employee.getSalary());
	}
}
