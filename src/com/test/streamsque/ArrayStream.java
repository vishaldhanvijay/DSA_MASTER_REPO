package com.test.streamsque;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayStream {

	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 3, 5, 8, 9};
		String[] words = {"apple", "banana", "cherry", "date", "apple"};
		// sort array asc
		Arrays.stream(arr).boxed().sorted().forEach(n-> System.out.println(n+" "));
		
		//  sort in reverse order 
		List<Integer> list = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("rev order: "+list);
		
		// find second largest
		
		int secondLarge = Arrays.stream(arr).boxed().sorted((a,b)-> b-a).skip(1).mapToInt(Integer::intValue).findFirst().orElse(-1);
		System.out.println("Second Largest : "+secondLarge);
		
		// freq of element
		
		   Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   
		System.out.println(map);
		//  print in desc order
		    map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));
		    System.out.println("-----------........................");

		    
		    
		    //or
		    System.out.println("ALTERNATE :");
		    
		    
		    map.entrySet().stream().sorted((a,b)-> b.getValue().compareTo(a
		    		.getValue())).forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));
		    
       //   pairs having sum 10
		     
		    System.out.println("Pairs that sum to 10:");
	        
	        IntStream.range(0, arr.length)
	            .forEach(i -> 
	                IntStream.range(i + 1, arr.length)
	                    .filter(j -> arr[i] + arr[j] == 10)
	                    .forEach(j -> System.out.println(arr[i] + " + " + arr[j]))
	            );	
	     // to find occurance of target no
	  	  int target =5;
	  	        long count = Arrays.stream(arr).filter(n-> n==target).count();
	  	        System.out.println("count : "+count);
	  	        
	  	        List<Integer> lst = Arrays.asList(5, 2, 8, 1, 3, 5, 8, 9);
	  	        
	  	        long count2 = lst.stream().filter(n-> n.equals(target) ).count();
	  	        System.out.println(count2);
  
	}
	
	
	
}
