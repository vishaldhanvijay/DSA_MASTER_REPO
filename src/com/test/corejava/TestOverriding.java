package com.test.corejava;

public class TestOverriding {

	
		public static void main(String[] args) {
			MethodOverriding  m= new Dog();
		
			 m.sound();
			 Dog d= (Dog) m;
			 
			 d.sound("loud");
			 System.out.println("Called overloded method");
			 
		
		}


}
