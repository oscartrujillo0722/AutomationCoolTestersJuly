package com.ejerciciosjavatarea2;

public class Biciesto {
	int year;

	public Biciesto(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		if (year >= 1 && year <= 9999) {
			if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}
