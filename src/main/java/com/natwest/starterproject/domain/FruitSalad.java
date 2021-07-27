package com.natwest.starterproject.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class FruitSalad {
		
		String type;
		String colour;
		int numberOf;
		
		@Autowired
		private Apples a;
		
		
		public FruitSalad() {
			System.out.println("Fruit Salad Created!");
		}
		
		public void checkApple() {
			System.out.println("Checking Apples...");
			a.taste();
					}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public int getNumberOf() {
			return numberOf;
		}

		public void setNumberOf(int numberOf) {
			this.numberOf = numberOf;
		}

	}

