package com.natwest.starterproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.natwest.starterproject.domain.FruitSalad;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StarterProjectApplication.class, args);
		System.out.println(context.getBean("greetings", String.class));
		FruitSalad fruitSalad = context.getBean(FruitSalad.class);
		fruitSalad.checkApple();
		
		
//		Object byName = context.getBean("greetings");
//		String byType = context.getBean(String.class);
//		String byBoth = context.getBean("greetings", String.class);
//		
//		System.out.println(byName);
//		System.out.println(byType);
//		System.out.println(byBoth);
		
		
	}

}
