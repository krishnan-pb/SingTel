package com.section.bonus;

public class SharkFish extends Fish {

	public SharkFish(Size sz, Colour c) {
		super(sz, c);
		// TODO Auto-generated constructor stub
	}
	
	public SharkFish (){
		
	}
	
	public void eat(Fish f){
		if(f instanceof ClownFish)
			System.out.println("Shark fish can eat clown fish");
		else
			System.out.println("Shark fish can eat other fish");
	}

}
