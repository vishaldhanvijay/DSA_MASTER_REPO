package com.test.streamsque;

import java.util.Arrays;
import java.util.List;

public class FindEven {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 6, 8, 9);

		list.stream().filter(n -> n % 2 == 2).forEach(System.out::println);
	}

}
