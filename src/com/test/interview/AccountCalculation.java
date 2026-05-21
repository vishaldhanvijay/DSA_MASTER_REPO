package com.test.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//You are given a list of transactions: [ {"accountId": "A1", "amount": 100}, {"accountId": "A2", "amount": 200}, {"accountId": "A1", "amount": 300}, {"accountId": "A2", "amount": 100} ] 
//Write a program to: 
//	1. Calculate total balance per account 
//	2.. Return account with highest balance

public class AccountCalculation {

	public static void main(String[] args) {
		List<Account> list = Arrays.asList(
				new Account("A1",100),
				new Account("A2",200),
				new Account("A1",300),
				new Account("A2",100),
				new Account("A3",100),
				new Account("A3",500)
				);
		// calculating total balance per account
		   Map<String, Integer> map = list.stream().collect(Collectors.groupingBy(Account::accountId,Collectors.summingInt(Account::amount)));
		   
		  map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+"- "+e.getValue()));
		  
//			2.. Return account with highest balance
		  
		  Map.Entry<String, Integer> highest = map.entrySet()
	                .stream()
	                .max(Map.Entry.comparingByValue())
	                .get();

	        System.out.println("\nAccount " + highest.getKey()
	                + " having highest amount of "
	                + highest.getValue());		
	        
	        // 2.. Return account with second highest balance
	        
	        Map.Entry<String, Integer> secondHighest =      map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).skip(1).findFirst().get();
	        System.out.println("\nAccount " + secondHighest.getKey()
            + " having second highest amount of "
            + secondHighest.getValue());	
	}

}

record Account(String accountId,int amount) {}
