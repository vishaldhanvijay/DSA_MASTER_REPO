package com.test.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingDigitMinMaxFromList {

	public static void main(String[] args) {
List<Integer>	list =Arrays.asList	(1,9,3,4,5,7,8);
      // sort asc
   List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
   System.out.println("asc: "+asc);
   
      // sort dsc
	List<Integer> dsc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("asc: "+asc);
     
       //min
      Integer min = list.stream().min(Integer::compareTo).orElseThrow();
      System.out.println("min: "+min);

      Integer max = list.stream().max(Integer::compareTo).orElseThrow();
      System.out.println("max: "+max);
      
      // min max by using summary statestics
             IntSummaryStatistics summaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
          
             System.out.println("summary min: "+summaryStatistics.getMin());
             System.out.println("summary max: "+summaryStatistics.getMax());
             
      // find missing
        List<Integer> missing = IntStream.rangeClosed(Collections.min(list), Collections.max(list)).boxed().filter(i-> !list.contains(i)).collect(Collectors.toList());
   System.out.println("missing no: "+missing);
   
      // sum
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: "+sum);
	}

}
