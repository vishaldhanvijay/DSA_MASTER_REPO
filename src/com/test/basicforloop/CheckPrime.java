package com.test.basicforloop;

public class CheckPrime {

	public static void main(String[] args) {
     int n= 19;
     boolean isprime= true;
     if(n<2) isprime= false;
     //for(int i=2 ;i<n/2; i++) {
    	 for(int i=2 ;i<Math.sqrt(n); i++) {
    	 if(n%i == 0) {
    		 isprime = false ;
    	 }
    	 
     }
     
     System.out.println("Is Prime: " + isprime);
	}

}
