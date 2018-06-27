package com.section.a.four;

public class Chicken extends Bird {
	@Override
	public void sing(){
		if(this.getSex() == Sex.FEMALE)
			System.out.println("Cluck, cluck");
		else
			System.out.println("Cock-a-doodle-doo");
	}
}
