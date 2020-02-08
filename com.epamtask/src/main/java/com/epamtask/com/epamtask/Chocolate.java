package com.epamtask.com.epamtask;
public class Chocolate extends Gift implements Comparable<Chocolate>{

	public Chocolate (int weight, int sweetness, String color) {
		super(weight, sweetness, color);
	}
	
	public int compareTo(Chocolate chocolate) {
		return chocolate.getSweetness() - this.getSweetness();
	}
	
}