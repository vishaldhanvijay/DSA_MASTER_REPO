package com.test.sorting;

// time complexity  O(nlog n)
// this is very fast
public class QuickSort {

	public static int[] sortArray(int[] arr, int low, int high) {
		if (low < high) {
			int pi = calculatePivot(arr, low, high);
			   // sort left side
			sortArray(arr, low, pi - 1);
			   // sort right side
			sortArray(arr, pi + 1, high);
		}
		return arr;
	}

	private static int calculatePivot(int[] arr, int low, int high) {
		int pivot = arr[high];  // last element as pivot

		int i = low - 1;
		 // arrange smaller elements before pivot
		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {

				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

        // place pivot at correct position

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 3, 8, 5, 6 };
		int low = 0;
		int high = arr.length - 1;
		int[] result = sortArray(arr, low, high);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
