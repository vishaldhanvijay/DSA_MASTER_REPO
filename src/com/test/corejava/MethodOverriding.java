package com.test.corejava;

public class MethodOverriding {

	void sound() {
		System.out.println("Animal makes sound");
	}
}


class Dog extends MethodOverriding{
	void sound() {
		System.out.println("Dog makes sound");
	}
	
	
	
	void sound(String str) {
		System.out.println("Dog is barking "+str);
		 super.sound();
	}
	
	
	
	
}

