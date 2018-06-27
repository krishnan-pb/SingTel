package com.section.d;

public class ParrotLivingWithDog extends ParrotDecorator {

	public ParrotLivingWithDog(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println(" Woof, woof");
	}
}
