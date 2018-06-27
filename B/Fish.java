package com.section.B;

public class Fish extends SwimmingAnimals {
	protected enum Size {LARGE, SMALL};
	protected enum Colour {GREY, ORANGE};
	protected Size sine;
	protected Colour colour;
	
	public Size getSine() {
		return sine;
	}
	public void setSine(Size sine) {
		this.sine = sine;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}	
	
	public Fish(Size sz, Colour c){
		this.sine = sz;
		this.colour = c;
	}
	
	public Fish(){
		
	}
}
