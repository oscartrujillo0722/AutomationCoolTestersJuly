package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad =61, limitevelocidad = 80; //km/h
		if (velocidad>limitevelocidad) {
			System.out.println("El coche va a exceso de velocidad, toma tu multa");
		}
		else { 
				System.out.println("vas bien");
			
			}
		
		// SWITCH CASE
		
		int temperatura = 20;
		
		switch (temperatura)
		{
		case 5:
		
		System.out.println("Clima muy frio");
		break;
		
		case 10:
			
			System.out.println("Clima frio");
			break;
			
       case 20:
			System.out.println("Clima templado");
			break;
       case 30:
			
			System.out.println("Clima muy caliente");
			break;
			
			default: 
				System.out.println("Clima no reconocible");
				break;
			
		
		}
		}
		

	}


