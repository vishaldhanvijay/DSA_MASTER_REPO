package com.test.streamsque;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighest {

	 public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};

	        int secondHighest = Arrays.stream(arr)
	                .boxed()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst()
	                .get();

	        System.out.println("Second Highest = " + secondHighest);
	    }

}
