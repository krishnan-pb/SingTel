package com.section.a.three;

public class Bird extends Animal implements WalkIF, SingIF {

	@Override
	public void sing() {
		System.out.println("I am Singing");		
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
		
	}
}
