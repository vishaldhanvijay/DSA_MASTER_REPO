package com.test.corejava;

public class MethodOverloading {
	
	public int add(int a ,int b) {
		return a+b ;
	}
	
	public int add(int a ,int b,int c) {
		return a+b+c ;
	}
	
	public double add(double a ,double b,int c) {
		return a+b+c ;
	}
	
	
public static void main(String[] args) {
	
	MethodOverloading m = new MethodOverloading();
	
	int res1=m.add(5, 6);
	double d = m.add(5.0,6.0, 7);
	
	System.out.println(res1);
	System.out.println(d);
	
	
}

}
