package com.test.streamsque;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {

	public static void main(String[] args) {
     List<String> list = Arrays.asList("vishal","kumar","rao");
     
     List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
     System.out.println(collect);
	}

}
