package com.test.interview;


/*Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"*/


public class FIndCOmmonPrefix {

	public static String findCommonPref(String[] arr) {
		
		if(arr==null || arr.length==0) {
		return "";	
		}
		
	String prefix =	arr[0];
	
	for(int i= 1 ; i< arr.length ;i++) {

		
		while (arr[i].indexOf(prefix) != 0) {
			prefix = prefix.substring(0,prefix.length()-1);
			if(prefix.isEmpty()) {
				return "";
			}
			
		}
	}
		return prefix;
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"flower", "flow", "flight"};

	String str	  =      findCommonPref(arr);
	System.out.println(str);
	}

	

}
