package com.test.streamsque;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurance {
	public static void main(String[] args) {
		String str = "aabbcdde";
		
		Map<Character, Long> map= str.chars()
			    .mapToObj(c -> (char) c)
			    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		List<Character> list = map.entrySet()
			    .stream()
			    .filter(e -> e.getValue() > 1)
			    .map(Map.Entry::getKey)
			    .toList();
		
		  // Print results
        System.out.println("Count Map: " + map);
        System.out.println("Duplicate Characters: " + list);
		     
	}
}
