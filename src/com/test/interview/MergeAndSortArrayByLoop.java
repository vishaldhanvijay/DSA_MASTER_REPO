package com.test.interview;

import java.util.Arrays;

public class MergeAndSortArrayByLoop {

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 4};
        int[] arr2 = {3, 5, 6};

        int index = 0 ;
        
        int[] result = new int[arr1.length + arr2.length];
        
        for(int i =0;i< arr1.length ;i++) {
        	result[index] = arr1[i];
        	index++ ;
        }
        
        for(int i =0;i< arr2.length ;i++) {
        	result[index] = arr2[i];
        	index++ ;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
        
        System.out.println();
        // consider arrays is not sorted  so use bubble sort
    
        for(int i=0 ; i< result.length -1 ;i++) {
        	for(int j=0 ; j< result.length- i-1; j++) {
        		if(result[j]< result[j+1]) {
					int temp = result[j] ;
					result[j] = result[j+1];
					result[j+1] = temp ;
				}        	
        	}
        }
        
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
	}

}
