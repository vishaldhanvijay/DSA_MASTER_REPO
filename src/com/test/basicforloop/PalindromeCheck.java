package com.test.basicforloop;

public class PalindromeCheck {

	public static void main(String[] args) {
		int n = 535;
		int original = n;
		int rev = 0;
		for(; n>0 ; n/=10 ) {
			
			rev = rev*10 + n%10;
			
		}
		System.out.println("rev: "+ rev);

		if(rev==original) {
			System.out.println("Its Palindrome");
		}else System.out.println("not palindrome");
	}

}
