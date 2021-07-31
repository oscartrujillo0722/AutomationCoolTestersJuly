package com.polimorfismo;

public class Main {

 public static void main(String[] args) {
// Humano
Animal animal = new Humano();
animal.speak();
// Gato
animal = new Gato();
animal.speak();
//Humano
animal = new Humano();
animal.speak();

 }

}