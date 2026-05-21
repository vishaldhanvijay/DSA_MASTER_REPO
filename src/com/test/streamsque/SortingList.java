
package com.test.streamsque;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vishal", "kumar", "rao");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
         
	}

}

