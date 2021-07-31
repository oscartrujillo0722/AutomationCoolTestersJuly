package com.java;

public class Buclestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while
		int numero = 1;
		while(numero <= 10) {
			System.out.println("el numero es"+ numero);
			numero ++;
		}
		
		//Do while (Cuantas veces se ttiene qwue sumar sum a si mismo para llegar a 100)
		
		int numeroSum = 7;
		int sumatotal = 0;
		int count = 0;
		
		do {
			//sumatotal = sumatotal + numeroSum;
			sumatotal += numeroSum;
			count ++;
		}
		while (sumatotal <100);{
		
		System.out.println("El numero se sumo "+ count + " veces");
	}
	
	// For
	//For con metodo
}
	public static void contador(int numeroFor) {
		 numeroFor = 10;
		
		for (int i=1;i<=numeroFor;i++)
			{ 
			System.out.println("El numero For es" +  i);
			if (i==5) {break;
			}
			}
		}
	}

