package com.test.interview;




import java.util.* ;
import java.util.stream.*;
import java.util.function.Function;
class CountRepeatingValuesInDesc {
    public static void main(String[] args) {
      
   List< String>  list = Arrays.asList("a","b","c","a","c","d","d","d");

     Map<String,Long> map=list.stream().collect(Collectors.groupingBy(c-> c, Collectors.counting()));
     map.entrySet().stream().filter(e-> e.getValue() > 1).sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e-> System.out.println(e.getKey()+"-"+ e.getValue()) );
    System.out.println("--------------------------------------------------");
    String str = "viisshaaallll" ;
       Map<Character,Long> map2 = str.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       
       map2.entrySet().stream().filter(e-> e.getValue() >1).sorted((a,b)-> b.getValue().compareTo(a.getValue())  ).forEach(System.out::println);
     
       
       int[] arr = {5, 2, 8, 1, 3, 5, 8, 9 ,9,9};
		
		//int val = Arrays.stream(arr).boxed().sorted((a,b)-> b - a).mapToInt(Integer::intValue).findFirst().orElseGet(null);   ////OR
		//int val = Arrays.stream(arr).boxed().sorted((a,b)->b.compareTo(a)).mapToInt(Integer::intValue).findFirst().orElseGet(null);   ///OR
		int val = Arrays.stream(arr).boxed().sorted(Comparator.comparingInt(Integer::intValue).reversed()).mapToInt(Integer::intValue).findFirst().orElseGet(null);
		System.out.println("highest: "+val);
		System.out.println("=============================================");
       Map<Integer,Long>  map3 =  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c-> c,Collectors.counting()));
        
       // map3.entrySet().stream().filter(e->e.getValue() > 1).sorted((a,b)-> b.getValue().compareTo(a.getValue())).forEach(e -> System.out.println(e.getKey()+"-"+e.getValue()));
   
map3.entrySet().stream().filter(e-> e.getValue()>1).sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e-> System.out.println(e.getKey() +"-"+ e.getValue()));
    
    
    }
}