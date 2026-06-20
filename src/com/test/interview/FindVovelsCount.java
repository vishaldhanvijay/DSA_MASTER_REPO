package com.test.interview;

import java.util.List;
import java.util.stream.Collectors;

public class FindVovelsCount {

	public static void main(String[] args) {
String str = "Aaple";

    // long count = str.toLowerCase().chars().mapToObj(c->(char)c).filter(ch-> "aeiou".indexOf(ch)>=0).distinct().count();
long count = str.toLowerCase().chars().mapToObj(c->(char)c).filter(ch-> "aeiou".chars().mapToObj(c->(char) c).anyMatch(s-> s == ch)).distinct().count();
     System.out.println(count);
     
     List<Character> list = str.toLowerCase().chars().mapToObj(c->(char)c).filter(ch-> "aeiou".indexOf(ch)>=0).collect(Collectors.toList());
System.out.println("vovels are : "+list);
List<Character> conso = str.toLowerCase().chars().mapToObj(c->(char)c).filter(ch-> "aeiou".indexOf(ch)==-1).collect(Collectors.toList());
System.out.println("Consonents are : "+conso);
	}

}
