package com.test.oopsconcept.inheritance;

public class Animal {
	String company = "TCS";
	  void eat() {
		  System.out.println("Animal is eating");
	  }

}


class Dog extends Animal {
	 void bark() {
	        System.out.println("Dog is barking");
	    }
	 
	 void eat() {
		  System.out.println("Eat method overrided");
	  }
}


