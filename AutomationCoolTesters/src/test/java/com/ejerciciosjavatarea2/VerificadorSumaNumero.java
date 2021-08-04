package com.ejerciciosjavatarea2;

public class VerificadorSumaNumero {
	int n1, n2, n3;
	boolean validador;

	public VerificadorSumaNumero(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	boolean hasEqualSum() {
		
		if (n1 + n2 == n3) {
			return true;
		} else {
			return false;
		}

	}
}
