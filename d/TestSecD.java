package com.section.d;


public class TestSecD {
	public static void main(String[] args) {
		ButterFly b = new ButterFly();
		System.out.println("ButterFly");
		b.fly();
		
		Catterpillar c = new Catterpillar();
		System.out.println("Catterpillar");
		c.walk();
		
		ButterFly butterFlyFromCaterpillar = new Metamorphosis().trnasform(c);
		System.out.println("butterFlyFromCaterpillar");
		butterFlyFromCaterpillar.fly();
	}
}
