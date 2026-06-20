package com.test.basicforloop;
//      1
//     121
//    12321
//   1234321
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 1; i <= n; i++) {
        	
        	

            // 1. Print spaces
            for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // 2. Print increasing numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 3. Print decreasing numbers
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }
    }
}
