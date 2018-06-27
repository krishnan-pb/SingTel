package com.section.a.three;

import com.section.a.three.Animal.Sex;

public class TestSecA3 {
	public static void main(String[] args) {
	
		Chicken chicken = new Chicken();
		chicken.setSex(Sex.FEMALE);
		System.out.println("Chicken");
		chicken.sing();
		Chicken rooster = new Chicken();
		rooster.setSex(Sex.MALE);
		System.out.println("Rooster");
		rooster.sing();
	}
}
