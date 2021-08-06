package com.ejerciciosjavatarea2;


public class Decimales {
	double n1, n2;

	public Decimales(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;

	}

	public boolean areEqualByThreeDecimalPlaces() {
		
		n1= n1*1000;
		n2=n2*1000;
		
		
		if ((int)n1 == (int)n2) {
			return true;
		} else {
			return false;
		}
	}

}
