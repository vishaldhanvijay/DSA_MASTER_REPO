package com.test.streamsque;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	public static void main(String[] args) {

		String str = "vishal";
// method 1
	//	String rev = Arrays.stream(str.split("")).reduce("", (a, b) -> (b + a));
		String rev = Arrays.stream(str.split("")).reduce("",(a,b)->(b+a));
		System.out.println("rev is : "+rev);
		
		

		// method 2

		String str1 = "abcdefg";
		char[] arr  =   str.toCharArray();   //we can do by converting into array
//		Arrays.stream(arr).mapToObj(c -> String.valueOf((char) c)).collect(
//				Collectors.collectingAndThen(Collectors.joining(), s -> new StringBuilder(s).reverse().toString()));

		String reversed = str1.chars().mapToObj(c -> String.valueOf((char) c)).collect(
				Collectors.collectingAndThen(Collectors.joining(), s -> new StringBuilder(s).reverse().toString()));

		System.out.println(reversed);
		
		//  other method 
		String name = "pavan"  ;
		
		
		
		
	}

}
