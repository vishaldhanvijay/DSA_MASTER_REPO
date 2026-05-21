package com.test.interview;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.

import java.util.*;

//The LeetCode logic class
class LeetCodeTriplet {
 public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     Arrays.sort(nums); // O(n log n)
     // after sort nums = [-4, -1, -1, 0, 1, 2]
     for (int i = 0; i < nums.length - 2; i++) {
         if (i > 0 && nums[i] == nums[i - 1]) continue; 
         if (nums[i] > 0) break;

         int left = i + 1;
         int right = nums.length - 1;
         
         while (left < right) {
             int sum = nums[i] + nums[left] + nums[right];
             if (sum == 0) {
                 result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                 while (left < right && nums[left] == nums[left + 1]) left++;
                 while (left < right && nums[right] == nums[right - 1]) right--;
                 left++;
                 right--;
             } else if (sum < 0) {
                 left++;
             } else {
                 right--;
             }
         }
     }
     return result;
 }
 
//Your execution code

 public static void main(String[] args) {
	 LeetCodeTriplet sol = new LeetCodeTriplet();
     
     // Example input
     int[] nums = {-1, 0, 1, 2, -1, -4};
     
     // Call the method and print the result
     List<List<Integer>> triplets = sol.threeSum(nums);
     
     System.out.println("Unique Triplets that sum to zero:");
     System.out.println(triplets);
 }
}

