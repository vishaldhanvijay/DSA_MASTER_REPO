package com.test.general;
// we can write : instead of -> but we have to write yield 
//  like  case  "tuesday" : yield "7 am";
public class SwitchCasePatternMatching {

	public static void main(String[] args) {
		String day = "mo";
		String result ="";
		 result =	switch (day) {
		case  "sunday","monday" -> "6 am";
		case  "tuesday" -> "7 am";
		default  -> "9 am";
		};
		System.out.println(result);

	}

}
