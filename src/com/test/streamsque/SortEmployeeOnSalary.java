package com.test.streamsque;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeOnSalary {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
                new Employee(1, "A", 50000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 60000)
        );
		
		list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);
	}

}
