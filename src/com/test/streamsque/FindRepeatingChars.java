package com.test.streamsque;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindRepeatingChars {
	public static void main(String[] args) {
		String str = "aabbcdde";
		
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char) c)
				.collect(Collectors.groupingBy(c->c ,LinkedHashMap::new ,Collectors.counting()));
		
		     List<Character> collect2 = collect.entrySet().stream().filter(e-> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		      
		      System.out.println(collect2);
	}
}
