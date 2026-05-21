package com.test.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        // Input array MUST be sorted
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 70;
        
        int resultIndex = binarySearch(numbers, target);
        
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // Using for loop instead of while
        for (; low <= high; ) {
            int mid = low + (high - low) / 2; // Avoids potential integer overflow

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (arr[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found
    }
}