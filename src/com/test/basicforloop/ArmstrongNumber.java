package com.test.basicforloop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n= 312;
		int original = n, sum = 0;
		for(; n > 0; n /= 10){
		    int d = n % 10;
		    sum += d*d*d;
		}
		System.out.println(sum == original ? "Armstrong" : "Not Armstrong");
	}

}
