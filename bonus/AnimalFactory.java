package com.section.bonus;

public class AnimalFactory {
	public static Animal getAnimal(String type) {
		if(type.equals("BIRD"))
			return new Bird();
		else if (type.equals("DUCK"))
			return new Duck();
		else if (type.equals("CHICKEN"))
			return new Chicken();
		else if (type.equals("PARROT"))
			return new Parrot();
		else if (type.equals("FISH"))
			return new Fish();
		else if (type.equals("SHARKFISH"))
			return new SharkFish();
		else if (type.equals("CLOWNFISH"))
			return new ClownFish();
		else if (type.equals("DOLPHIN"))
			return new Dolphins();
		else if (type.equals("BUTTERFLY"))
			return new ButterFly();
		else if (type.equals("CATERPILLAR"))
			return new Catterpillar();
		else
			return null;
	}
}
