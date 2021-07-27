package com.natwest.starterproject.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {
	
	@Bean	
	public String greetings() {
		return "Application started at: " + LocalTime.now();
	
	}

	
	
	
}
