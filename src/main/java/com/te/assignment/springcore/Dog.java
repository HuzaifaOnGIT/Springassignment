package com.te.assignment.springcore;


	

	public class Dog implements Animal {

		@Override
		public void eats() {
			System.out.println("Dog is eating");
			
		}

		@Override
		public void runs() {
			System.out.println("Dog is Running");
		}

	}

