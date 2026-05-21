package com.test.streamsque;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "aabbcdde";
		
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char) c)
				.collect(Collectors.groupingBy(c->c ,LinkedHashMap::new ,Collectors.counting()));
		
		      Character firstNonRep = collect.entrySet().stream().filter(e-> e.getValue() ==1).map(Map.Entry::getKey).findFirst().get();
		      
		      System.out.println(firstNonRep);
	}

}
