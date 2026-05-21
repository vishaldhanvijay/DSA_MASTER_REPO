package com.test.streamsque;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenList {
	 public static void main(String[] args) {
	        List<List<Integer>> listOfLists = Arrays.asList(
	                Arrays.asList(1,2),
	                Arrays.asList(3,4)
	        );

	        listOfLists.stream()
	                .flatMap(Collection::stream)
	                .forEach(System.out::println);
	    }
}
