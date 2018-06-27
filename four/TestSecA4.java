package com.section.a.four;



public class TestSecA4 {
	public static void main(String[] args) {
	
		ParrotLivingWithDog parrotLivingWithDog = new ParrotLivingWithDog(new Parrot());
		System.out.println("parrotLivingWithDog");
		parrotLivingWithDog.sing();
		
		ParrotLivingWithCat parrotLivingWithCat = new ParrotLivingWithCat(new Bird());
		System.out.println("parrotLivingWithCat");
		parrotLivingWithCat.sing();
		
		ParrotLivingWithRooster parrotLivingWithRooster = new ParrotLivingWithRooster(new Bird());
		System.out.println("parrotLivingWithRooster");
		parrotLivingWithRooster.sing();
	}
}
