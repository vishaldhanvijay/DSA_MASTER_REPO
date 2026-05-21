package com.test.streamsque;

import java.util.Arrays;
import java.util.List;

public class FindSum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		//OR
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		// Integer sum1 = list1.stream().mapToInt(Integer::intValue).reduce(0,(a,b)->a+b);
		Integer sum1 = list1.stream().reduce(0,(a,b)->a+b);
		 System.out.println(sum1);

	}
}
