package com.section.a.two;

public class TestSecA2 {
	public static void main(String[] args) {
		Duck duck = new Duck();
		System.out.println("Duck");
		duck.sing();
		duck.swim();
		
		Chicken chicken = new Chicken();
		System.out.println("Chicken");
		chicken.walk();
		chicken.sing();
	}
}
