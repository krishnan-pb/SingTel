package com.section.a.one.a;

class Animal {
	void walk(){
		System.out.println("I am walking");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
	void sing() {
		System.out.println("I am Singing");
	}
}
public class Solution1A {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
