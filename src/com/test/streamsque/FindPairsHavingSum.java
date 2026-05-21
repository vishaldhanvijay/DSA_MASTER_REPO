package com.test.streamsque;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindPairsHavingSum {

	public static void main(String[] args) {
		int[] arr = {5,8, 2, 1, 3, 5, 8, 9};
		
		IntStream.range(0, arr.length)
		.forEach(i->IntStream.range(i+1, arr.length)
				.filter(j-> arr[i]+ arr[j]==10)
				.forEach(j-> System.out.println(arr[i]+ "->" + arr[j]))
				)
		;
		
		
		 int target = 8 ;
		 
		 long count = Arrays.stream(arr).filter(i-> i== target).count();
		 System.out.println("target occuring "+count+ " times");
		// forEach(i-> System.out.println("target found at index"+ i + " "));
	}

}
