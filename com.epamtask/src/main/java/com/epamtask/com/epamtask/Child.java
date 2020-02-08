package com.epamtask.com.epamtask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Child{
	String name;
	List<Sweet> sweets;
	List<Chocolate> chocolates;
	
	public Child(String name) {
		this.name = name;
		sweets = new ArrayList<Sweet>();
		chocolates = new ArrayList<Chocolate>();
	}
	
	public int getTotalGiftWeight() {
		int total = 0;
		
		for(Sweet sweet:sweets) {
			total = total + sweet.getWeight();
		}
		
		for(Chocolate chocolate:chocolates) {
			total = total + chocolate.getWeight();
		}
		
		return total;
		
	}
	
	public void sortChocolatesBySweetness() {
		Collections.sort(chocolates);
	}
	
	public boolean findSweetInSweets(String name) {
		for(Sweet sweet:sweets) {
			if(sweet.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public List<Sweet> getSweets() {
		return sweets;
	}

	public List<Chocolate> getChocolates() {
		return chocolates;
	}
	
	public void addChocolate(Chocolate chocolate) {
		chocolates.add(chocolate);
	}
	
	public void addSweet(Sweet sweet) {
		sweets.add(sweet);
	}

}