package com.test.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersInFullName {
	// if you want to calculate spaces as well then dont use  filter(ch -> ch != ' ')
	public static void main(String[] args) {
        String name = "vishal pancham dhanvijay";
      Map<Character,Long> map =  name.trim().chars().mapToObj(c->(char)c)
        .filter(ch -> ch != ' ').collect(Collectors.groupingBy(ch->ch ,Collectors.counting()));
        
        map.entrySet().stream().distinct().forEach(e-> System.out.println(e.getKey()+" "+ e.getValue()));
    }
}
