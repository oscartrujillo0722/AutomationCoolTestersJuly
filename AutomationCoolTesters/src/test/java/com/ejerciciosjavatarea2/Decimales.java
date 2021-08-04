package com.ejerciciosjavatarea2;

import java.text.DecimalFormat;

public class Decimales {
	double n1, n2;

	public Decimales(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;

	}

	public boolean areEqualByThreeDecimalPlaces() {
		DecimalFormat formato1 = new DecimalFormat("#.00");
		System.out.println(formato1.format(n1));
		System.out.println(formato1.format(n2));
		if (formato1.format(n1) == formato1.format(n2)) {
			return true;
		} else {
			return false;
		}
	}

}
