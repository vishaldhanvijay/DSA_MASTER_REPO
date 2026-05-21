package com.test.streamsque;

import java.util.Arrays;
import java.util.List;

public class FindOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 6, 8, 9);

		list.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
	}

}
