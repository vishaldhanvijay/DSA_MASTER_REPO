package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3Triplet {
	public static List<List<Integer>> calculateTriplet(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		int target = 9;
		Arrays.sort(arr);
		for(int i=0;i<arr.length -2 ; i++) {
			if(i>0 && arr[i]==arr[i-1]) continue;
			if(arr[i] > target) break ;
			
			int left = i+1;
			int right = arr.length -1 ;
			while(left<right) {
				int sum = arr[i]+ arr[left]+ arr[right];
				if(sum==target) {
					result.add(Arrays.asList(arr[i],arr[left],arr[right]));
					while(left<right && arr[left]==arr[left-1]) left++;
					while(left<right && arr[left]==arr[right-1]) right--;
					left++;
					right--;
				
				} if(sum<target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 3, 1, 6, 9, 7, 1 };

		List<List<Integer>> list = calculateTriplet(arr);
		System.out.println(list);
	}

}
