package com.test.basicforloop;

public class CountDigits {
	 public static void main(String[] args) {
	        int n = 98765;
	        int count = 0;

	        for(; n > 0; n /= 10) {
	            count++;
	        }

	        System.out.println("Digits = " + count);
	    }
}
