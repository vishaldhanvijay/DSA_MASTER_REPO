package com.test.streamsque;

import java.util.Arrays;
import java.util.List;

public class FindMin {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer max = list.stream().min(Integer::compare).get();
		System.out.println(max);
	}
}
