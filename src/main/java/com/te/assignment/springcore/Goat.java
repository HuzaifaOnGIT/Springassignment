package com.te.assignment.springcore;

public class Goat implements Animal{

	@Override
	public void eats() {
		System.out.println("Goat is eating");

	}
	@Override
	public void runs() {
		System.out.println("Goat is Running");
	}
}