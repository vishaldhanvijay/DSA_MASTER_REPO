package com.test.general;

public class SingletonClass {
public static SingletonClass singleton;

private SingletonClass() {
	
}


public static SingletonClass getInstance() {
	
	if(singleton == null) {
		singleton = new SingletonClass();
		return singleton; 
	} else return singleton;
}
	
	public static void main(String[] args) {
		SingletonClass s = SingletonClass.getInstance();
		System.out.println("obj1:"+ s.hashCode());
		SingletonClass s1 = SingletonClass.getInstance();
		System.out.println("obj2:"+ s1.hashCode());
	}
}
