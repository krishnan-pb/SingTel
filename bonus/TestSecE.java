package com.section.bonus;

import java.util.List;
import java.util.ArrayList;


public class TestSecE {
	static List<Animal> animals;
	public static void main(String[] args) {
		animals = new ArrayList<Animal>();
		animals.add(AnimalFactory.getAnimal("BIRD"));
		animals.add(AnimalFactory.getAnimal("DUCK"));
		animals.add(AnimalFactory.getAnimal("CHICKEN"));
		animals.add(AnimalFactory.getAnimal("PARROT"));
		animals.add(AnimalFactory.getAnimal("FISH"));
		animals.add(AnimalFactory.getAnimal("SHARKFISH"));
		animals.add(AnimalFactory.getAnimal("CLOWNFISH"));
		animals.add(AnimalFactory.getAnimal("DOLPHIN"));
		animals.add(AnimalFactory.getAnimal("BUTTERFLY"));
		animals.add(AnimalFactory.getAnimal("CATERPILLAR"));
		
		int fly = 0,sing = 0,swim = 0,walk = 0;
		
		for(Animal animal : animals ){
			if (animal instanceof FlyIF)
				fly++;
			if(animal instanceof SwimIF)
				swim++;
			if(animal instanceof SingIF)
				sing++;
			if(animal instanceof WalkIF)
				walk++;
		}
		
		System.out.println("No of animals that can  fly is " + fly);
		System.out.println("No of animals that can  sing is " + sing);
		System.out.println("No of animals that can  swim is " + swim);
		System.out.println("No of animals that can  walk is " + walk);
	}
}
