package com.test.interview;

import java.util.ArrayList;
import java.util.List;

//input = 15 output = [12345],[456],[78] 
public class CalculateListHAvingSum15 {
	
	public static List<List<Integer>> findSequence(int target) {
		
		
		int start =1;
		int end = 1;
		int sum =1;
		
		List<List<Integer>> result = new ArrayList<>();
		while(start<target) {
			List<Integer> list = new ArrayList();

			if(sum==target) {
			for(int i=start ;i<=end;i++) {
				
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
		int target = 15 ;
		
		List<List<Integer>> list = findSequence(target);
		System.out.println(list);

	}

}
