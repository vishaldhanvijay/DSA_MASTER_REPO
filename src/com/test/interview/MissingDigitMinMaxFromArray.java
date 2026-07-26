package com.test.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingDigitMinMaxFromArray {

	public static void main(String[] args) {
         int[] arr = {1,9,3,4,5,7,8};
         
         // sorting in asc
          List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
          System.out.println("Sorted asc List: "+list);
          // sorting in dsc    
          List<Integer> list1 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
          System.out.println("Sorted rev List: "+list1);
          
          // min
          int min = Arrays.stream(arr).min().orElseThrow();
          System.out.println("min value: "+min);
          
          // max
          int max = Arrays.stream(arr).max().orElseThrow();
          System.out.println("min value: "+max);
          // sum
          int sum = Arrays.stream(arr).sum();
          System.out.println("sum: "+sum);
          
          // missing digits use rangeClosed()
      List<Integer> missing = IntStream.rangeClosed(min, max).filter(i->Arrays.stream(arr).noneMatch(x-> x==i)).boxed().collect(Collectors.toList());      
           System.out.println("rangeClosed: "+missing);
          
          
          
	}

}
