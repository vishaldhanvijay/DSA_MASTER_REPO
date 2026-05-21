package com.test.sorting;

public class SelectionSort {
//  time complexity O(n2)  , slow less swaps than bubble sort
	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 4, 2};
		
		for(int i=0 ;i< arr.length-1 ;i++) {
			
			int minIndex = i;
			
			for(int j = i+1; j< arr.length ;j++) {
				
				if(arr[j]< arr[minIndex]) {    // this <  is for ascending sorting use > for descending
					minIndex = j ;
				}
				
			}
			// swap
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp ;
		}
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

}
