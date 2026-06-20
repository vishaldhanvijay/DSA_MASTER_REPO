package com.test.binarysearch;

public class KinearSearch {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 70;
        
        
        for(int i = 0;i<numbers.length ;i++ ) {
        	if(numbers[i]== target) {
        		System.out.println("target founf at index "+i);
        	}
        }
	}

}
