package com.epamtask.com.epamtask;
public class Gift {
	int weight;
	int sweetness;
	String name;

	public Gift(int weight, int sweetness, String name) {
		super();
		this.weight = weight;
		this.sweetness = sweetness;
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSweetness() {
		return sweetness;
	}
	public void setSweetness(int sweetness) {
		this.sweetness = sweetness;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}