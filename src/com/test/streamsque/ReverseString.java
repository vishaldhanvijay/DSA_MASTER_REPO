package com.test.streamsque;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {

		String str = "vishal";
// method 1
	//	String rev = Arrays.stream(str.split("")).reduce("", (a, b) -> (b + a));
		String rev = Arrays.stream(str.split("")).reduce("",(a,b)->(b+a));
		System.out.println("rev is : "+rev);
		
		

		// method 2

		String str1 = "abcdefg";

		String reversed = str1.chars().mapToObj(c -> String.valueOf((char) c)).collect(
				Collectors.collectingAndThen(Collectors.joining(), s -> new StringBuilder(s).reverse().toString()));

		System.out.println(reversed);
	}

}
