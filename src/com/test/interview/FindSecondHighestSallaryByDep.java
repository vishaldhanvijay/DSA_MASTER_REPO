package com.test.interview;

//Given a list of employees with their names, department, and salary, write a java 8 stream-based function to find the 2nd highest paid employee in each department. The input will be a list of employee objects, and output should be a Map where the key is the department and value are the 2nd highest paid employee in that department.
import java.util.* ;
import java.util.stream.* ;
public class FindSecondHighestSallaryByDep {
 public static void main(String[] args) {
     List<Employ>  list = Arrays.asList(
     new Employ("hr",2000),
     new Employ("sal   es",4000),
     new Employ("hr",3000),
     new Employ("hr",5000),
     new Employ("sales",6000));
      
    Map<String, List<Integer>> map = list.stream().collect(Collectors.groupingBy(Employ::department , Collectors.mapping(Employ::salary ,Collectors.toList()))) ;
    
map.forEach((department, salaries) -> {
    Optional<Integer> secondHighest = salaries.stream()
            // Sort descending
            .sorted(Comparator.reverseOrder()) 
            // Skip the 1st highest
            .skip(1)                          
            .findFirst();

        if (secondHighest.isPresent()) {
            System.out.println("Department: " + department + " has second highest salary around " + secondHighest.get());
        } else {
            System.out.println("Department: " + department + " doesn't have enough data for a 2nd highest salary.");
        }
    });
 }
}


record Employ(String department , int salary){}