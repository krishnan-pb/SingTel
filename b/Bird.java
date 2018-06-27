package com.section.a.one.b;

public class Bird extends Animal implements WalkIF, SingIF, FlyIF {

	@Override
	public void sing() {
		System.out.println("I am Singing");		
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
		
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}

}
