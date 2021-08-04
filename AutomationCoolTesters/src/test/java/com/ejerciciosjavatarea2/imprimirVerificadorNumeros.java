package com.ejerciciosjavatarea2;

public class imprimirVerificadorNumeros {
	int n1, n2, n3;

	public imprimirVerificadorNumeros(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		if (n1 < 0 || n2 < 0 || n3 < 0) {
			System.out.println("valor no valido");
		} else if (n1 == n2 && n2 == n3) {
			System.out.println("Todos los numeros son iguales");
		} else if (n1 != n2 && n2 != n3) {
			System.out.println("Todos los números son diferentes");
		} else {
			System.out.println("Ni todos los números son iguales ni tampoco diferentes");
		}

	}

}
