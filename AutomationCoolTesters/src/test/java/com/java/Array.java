package com.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dias = {"L","M","Mi","J","v","s","d"};
		System.out.println("El d�a es "+dias[5]);
		for (int i=0;i<dias.length;i++) {
			//el .length me trae el numero de posiciones en el arreglo
			System.out.println(dias[i]);
			
			//Arreglo bidimensional
			
			String[][] nombreCompleto = new String [4][4];
			nombreCompleto[0][0] = "Ricardo";
			nombreCompleto[0][1] = "Avalos";
			nombreCompleto[1][0] = "Oscar";
			nombreCompleto[1][1] = "Trujillo";
			nombreCompleto[2][0] = "Sonia";
			nombreCompleto[2][1] = "Rojas";
			nombreCompleto[3][0] = "Alejandro";
			nombreCompleto[3][1] = "Soria";
			
			System.out.println("El nombre es "+ nombreCompleto[0][0] + " " + nombreCompleto[0][1]+ " " +nombreCompleto[1][0] + " " + nombreCompleto[1][1]+ " " +nombreCompleto[2][0] + " " + nombreCompleto[2][1]+ " " +nombreCompleto[3][0] + " " + nombreCompleto[3][1]);
			
		}

	}

}
