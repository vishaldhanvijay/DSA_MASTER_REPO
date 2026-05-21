package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHouseNoFlatMap {
	private  String name;

	private Address address;

	public EmployeeHouseNoFlatMap(String name, Address address) {

		this.name = name;
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address ;
	}

	public static void main(String[] args) {
		List<EmployeeHouseNoFlatMap> list = Arrays.asList(
				new EmployeeHouseNoFlatMap("vishal", new Address(Arrays.asList("house1", "house12", "house123"))),
				new EmployeeHouseNoFlatMap("pancham", new Address(Arrays.asList("house", "housee112", "house5"))),
				new EmployeeHouseNoFlatMap("pancham", new Address(Arrays.asList("house", "housee112", "house123"))));


		 String secondHighHouseNo = list.stream()
	                .flatMap(e -> e.getAddress().houseNo().stream())
	                .sorted(Comparator.comparingInt(String::length).reversed())
	                .skip(1)
	                .findFirst()
	                .orElse(null);


System.out.println("house no having second highest length is: "+ secondHighHouseNo);

     //   if we have to find list of house nos having second  highest length then

             // get the highest length first
                    Integer integer = list.stream().flatMap(e-> e.getAddress().houseNo().stream())
                    .map(String::length)
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElseGet(null);
                    
                    System.out.println("Second highest length...:"+integer);
                    
                    // we can get the second high length by collecting length in descending and using get(1)
                    
                    List<Integer> collect2 = list.stream().flatMap(e->e.getAddress().houseNo().stream()).map(String::length).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                    int secondHigh = collect2.get(1);
             // now from original list we will filter those house no of that length and collect as list
                    
                  //  List<String> collect = list.stream().flatMap(e-> e.getAddress().houseNo().stream()).filter(e-> e.length() ==integer).collect(Collectors.toList());
                    List<String> collect3 = list.stream().flatMap(e-> e.getAddress().houseNo().stream()).filter(e-> e.length() == secondHigh).collect(Collectors.toList());
                    
System.out.println("List : "+ collect3);

	}

}

record Address(List<String> houseNo) {
}