package com.te.assignment.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

	@Bean("dog")
	public Animal getdog() {
		Animal animals = new Dog();
		animals.eats();
		animals.runs();
		return animals;
	}
	@Bean("cat1")
	public Animal getGoat() {
		Animal animal = new Goat();
		animal.eats();
		animal.runs();
		return animal;
	}
}