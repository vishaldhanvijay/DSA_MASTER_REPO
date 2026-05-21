package com.test.basicforloop;

public class SumOfDigits {
	public static void main(String[] args) {
        int n = 987;
        int sum = 0;

        for(; n > 0; n /= 10) {
            sum += n % 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
