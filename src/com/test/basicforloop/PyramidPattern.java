package com.test.basicforloop;

//      *
//     * *
//    * * *
//   * * * * 
public class PyramidPattern {

	public static void main(String[] args) {
//		for (int i = 1; i < 4; i++) {
//			for (int j = 4; j >= i; j--) {
//				System.out.print(" ");
//				
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		int n =4 ;
		for(int i=1 ; i< n ;i++) {
			
			// for space
			for(int space = 4 ;space >=i ;space--) {
				System.out.print(" ");
			}
			//for  *
			
			for(int j=1 ;j<= i;j++) {
				System.out.print(" *");

			}
			System.out.println();

		}
	}

}
