package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindListOfCOnsecuticeNumFromString {

	public static void main(String[] args) {
		String str = "abc45679def123";

		List<String> result = new ArrayList<>();

		String digitsOnly = str.replaceAll("[^0-9]", " ");

		Arrays.stream(digitsOnly.trim().split("\\s+")).forEach(part -> {
			StringBuilder sb = new StringBuilder();
			sb.append(part.charAt(0));

			for (int i = 1; i < part.length(); i++) {
				if (part.charAt(i) - part.charAt(i - 1) == 1) {
					sb.append(part.charAt(i));
				} else {
					if (sb.length() > 1) {
						result.add(sb.toString());
					}
					sb = new StringBuilder();
					sb.append(part.charAt(i));
				}
			}

			if (sb.length() > 1) {
				result.add(sb.toString());
			}
		});

		System.out.println(result);
	}

}
