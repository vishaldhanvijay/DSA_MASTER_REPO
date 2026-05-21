package com.test.streamsque;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> first = list.stream().findFirst();
		Integer num = first.get();
		System.out.println(num);
	}

}
