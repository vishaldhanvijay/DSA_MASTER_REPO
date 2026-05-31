package com.test.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindListOfPossibleInteger {

	public static void main(String[] args) {
        List<String> list = Arrays.asList("ab", "123", "24", "bcd", "2d");
        
        
          List<Integer> collect = list.stream().filter(e-> e.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
          System.out.println("Integers list is : "+collect);
          
          
          // but if you want to find all digits then 
          
          List<Integer> list2 = list.stream().flatMap(e-> e.chars().filter(Character::isDigit).boxed()).map(c-> c - '0').collect(Collectors.toList());
          
          System.out.println("all numbers list is: "+list2);
          
          
          
         List<Character> collect2 = list.stream().flatMap(c-> c.chars().filter(Character::isLetter).mapToObj(r->(char) r)).collect(Collectors.toList());
          
          System.out.println("All characters list: "+collect2);

	}
	

}
