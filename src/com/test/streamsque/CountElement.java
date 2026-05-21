package com.test.streamsque;

import java.util.Arrays;
import java.util.List;

public class CountElement {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vishal", "kumar", "rao");
		long count = list.stream().count();
		System.out.println(count);
		
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		long count2 = list1.stream().count();
		System.out.println(count2);

	}

}
