package com.polimorfismo;

public class Perro extends Animal {

	public Perro() {
		super("Perro");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(getAnimal() + " wow-wow");
		// TODO Auto-generated method stub

	}

}
