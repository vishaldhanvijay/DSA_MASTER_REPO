package com.test.streamsque;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 5, 7);
		Set<Integer> set = new HashSet();
		List<Integer> list2 = list.stream().filter(n-> !set.add(n)).collect(Collectors.toList());
		
		System.out.println(list2);
	}

}
