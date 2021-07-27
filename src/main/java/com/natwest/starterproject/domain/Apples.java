package com.natwest.starterproject.domain;

import org.springframework.stereotype.Component;

@Component
public class Apples {
	
	String name;
	String colour;
	
	public void taste() {
		System.out.println("This apple is tasty");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public String getColour() {
		return colour;
	}




	public void setColour(String colour) {
		this.colour = colour;
	}




	@Override
	public String toString() {
		return "Apples [name=" + name + ", colour=" + colour + "]";
	}
	
	
	

}
