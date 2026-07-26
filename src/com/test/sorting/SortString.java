package com.test.sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortString {

	public static void main(String[] args) {
String str = "Vishal "  ;

  char[] arr =  str.trim().toLowerCase().toCharArray();
       
  Arrays.sort(arr); //OR
  StringBuilder sb = new StringBuilder();
  for(char c : arr) {
	  sb.append(c);
  }
  
  
  System.out.println(sb.toString());
  
  String str1 = "vishal"  ;
  
  Character[] array = new Character[str1.length()];

  for (int i = 0; i < str1.length(); i++) {
      array[i] = str1.charAt(i);
  }

  Arrays.sort(array, Collections.reverseOrder());

  System.out.println(Arrays.toString(array));
  
  //  if string contain digits then 
  
  String str2 = "012110122210";

  char[] arr2 = str2.toCharArray();

  Arrays.sort(arr2);
  
  
  StringBuilder sb1 = new StringBuilder();
  for(char c : arr2) {
	  sb1.append(c);
  }
  
  System.out.println(sb1.toString());
  
  
  //   other method
  String name = "developer";
     String string = name.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
     
     System.out.println(string);

  
	}

}
