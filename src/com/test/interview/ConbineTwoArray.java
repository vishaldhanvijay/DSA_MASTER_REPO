package com.test.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConbineTwoArray {

	public static void main(String[] args) {
		Integer[] arr1 = {1, 2, 3};
		Integer[] arr2 = {4, 5, 6};
		
		Integer[] mergedArray = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(Integer[]::new);
		System.out.println(Arrays.toString(mergedArray));
		
		
		List<Integer> list1  =  Arrays.asList(5,6,7,8);
		Integer[] array = list1.stream().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(array));
	}

}
