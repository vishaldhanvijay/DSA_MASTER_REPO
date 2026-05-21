package com.test.searching;

//Logic
//Find middle element
//Compare with target
//If target is smaller → search left side
//If target is greater → search right side
//Repeat until found
//time complexity O(log n)
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int target = 9;
		boolean found = false;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (target == arr[mid]) {
				found = true;
				System.out.println("Target is at position: " + mid);
				break;
			} else if (target < arr[mid]) {
				high = mid - 1;

			} else if (target > arr[mid]) {
				low = mid + 1;
			}

		}
		if (!found) {
			System.out.println("element not exist in array");
		}
	}

}
