package com.test.interview;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceByLoop {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 3, 5, 5, 5, 5 };
		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0; i< arr.length ; i++) {
//			if(map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i])+1);
//			} else {
//				map.put(arr[i], 1);
//			}
//		}
//System.out.println(map);
		

// other method by using map.getOrDefault()
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		}
		System.out.println(map);
	}

}
