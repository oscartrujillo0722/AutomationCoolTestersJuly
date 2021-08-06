package com.ejerciciosjavatarea2;

public class printMegaBytesAndKiloBytes {
	int kiloBytes, remainingK;
	double megas;

	public printMegaBytesAndKiloBytes(int kiloBytes) {
		this.kiloBytes = kiloBytes;
		if (kiloBytes <= 0) {
			System.out.println("Valor invalido");
		} else {
			megas = kiloBytes / 1024;
			remainingK = kiloBytes - ((int) megas * 1024);
			System.out.println(kiloBytes + " KB = " + (int)megas + " MB and " + remainingK + " KB");
		}

	}
}
