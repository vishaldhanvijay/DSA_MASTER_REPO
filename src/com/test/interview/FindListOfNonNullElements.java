package com.test.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindListOfNonNullElements {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", null, "Spring", null, "Angular");
		   List<String> list2 = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("non null elements: "+list2);
		
		 String str= "vishhal";
		 
		 long count = str.chars().count();
		 
		 System.out.println(count);
		 
	}

}
