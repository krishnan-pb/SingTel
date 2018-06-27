package com.section.B;

public class Duck extends Bird implements SwimIF{
	@Override
	public void sing(){
		System.out.println("Quack, quack");
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}
}
