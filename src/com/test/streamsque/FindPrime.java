package com.test.streamsque;

import java.util.Arrays;
import java.util.List;

public class FindPrime {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 8, 9);

		list.stream().filter(FindPrime::isPrime).forEach(System.out::println);
	}

	public static boolean isPrime(int n) {

		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
