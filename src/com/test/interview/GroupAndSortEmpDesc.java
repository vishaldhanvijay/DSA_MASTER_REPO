package com.test.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndSortEmpDesc {

	public static void main(String[] args) {

        List<Emp> list = Arrays.asList(
                new Emp("def", 26000.00f),
                new Emp("abc", 23000.00f),
                new Emp("xyz", 35000.00f),
                new Emp("ghj", 23000.00f),
                new Emp("kpy", 50000.00f),
                new Emp("hjd", 15000.00f)
        );
        
        Map<Float, List<String>> result =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Emp::salary,
                                Collectors.mapping(Emp::empName,
                                        Collectors.toList())
                        ))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.<Float, List<String>>comparingByKey()
                                .reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a, b) -> a, LinkedHashMap::new)
                        		);

        result.forEach((salary, names) ->
        System.out.println("(" + salary + ") -> " + names));
	}

}


record Emp(String empName, float salary) {}