package com.test.searching;
// time complexity O(1)   slow
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 5, 6, 7 };
		int target = 9;
		boolean isFound = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("target is at position : " + i);
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("element not found");
		}
	}

}
