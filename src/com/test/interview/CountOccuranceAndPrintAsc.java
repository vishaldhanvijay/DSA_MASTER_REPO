package com.test.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuranceAndPrintAsc {

	public static void main(String[] args) {

		String str = "aabbcdee";
		
		//method 1
		//Arrays.stream(str.split("")).collect(Collectors.groupingBy(c->(char)c),Collectors.counting());
		
		 Map<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		 
		 //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));
		 map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e->System.out.println(e.getKey() +"-"+ e.getValue()));
		
	}

}
