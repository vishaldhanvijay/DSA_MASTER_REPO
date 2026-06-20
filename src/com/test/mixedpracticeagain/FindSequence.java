package com.test.mixedpracticeagain;

import java.util.ArrayList;
import java.util.List;

public class FindSequence {
	
	
	public static List<List<Integer>> calculateSequence(int target){
		
		int start =1;
		int end =1;
		int sum=1;
		List<List<Integer>> result = new ArrayList<>();
		while(start<target) {
			if(sum==target) {
				List<Integer> list = new ArrayList<>();
				for(int i=start;i<=end ; i++) {
					list.add(i);
				}
				
			result.add(list);	
			 sum-=start;
			 start++;
				
			} else if(sum<target) {
				end++ ;
				
				sum+=end;
				
				
			}else {
				 sum-=start;
				 start++;
			}
			
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		int input = 15  ;
		List<List<Integer>>  list =   calculateSequence(input);
System.out.println(list);
	}

}
