package com.test.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//  find employee having third highest sallary
public class FindEmpWIthHighestSalary {

	public static void main(String[] args) {
      List<Employee> list = Arrays.asList(new Employee(1, "kunal", 5000),new Employee(2, "vishal", 4000),new Employee(3, "arun", 3000));
      
       Employee employee = list.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst().get();
         System.out.println("Employee is: "+employee.getName());
      
	}

}
