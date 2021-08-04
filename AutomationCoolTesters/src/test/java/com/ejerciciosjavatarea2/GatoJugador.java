package com.ejerciciosjavatarea2;

public class GatoJugador {

	boolean verano, jugando;
	int temperatura;

	public GatoJugador(boolean verano, int temperatura) {
		this.temperatura = temperatura;
		this.verano = verano;

	}

	public boolean isCatPlaying() {

		if (verano == true) {
			if (temperatura >= 25 && temperatura <= 45) {
				jugando = true;
			} else {
				jugando = false;
			}
		} else {
			if (temperatura >= 25 && temperatura <= 35) {
				jugando = true;
			} else {
				jugando = false;
			}
		}

		return jugando;
	}
}
