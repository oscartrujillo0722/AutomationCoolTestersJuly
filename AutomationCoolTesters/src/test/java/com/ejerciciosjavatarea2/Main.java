package com.ejerciciosjavatarea2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

////////////////////////////Ejercicio Gatos///////////////////////////////

		GatoJugador pepita = new GatoJugador(false, 35);
		boolean estaJugando = pepita.isCatPlaying();
		System.out.println(estaJugando);
		// System.out.println(pepita.isCatPlaying());

//////////////////////////////imprimir verificador de números/////////////

		new imprimirVerificadorNumeros(1, 7, 2);
///////////////////////////////Verificador suma numero///////////////////77
		VerificadorSumaNumero validador = new VerificadorSumaNumero(1,1,8);
		System.out.println(validador.hasEqualSum());

//////////////////////////// Biciesto//////////////////
		
		Biciesto biciesto = new Biciesto(2000);
		System.out.println(biciesto.isLeapYear());
//////////////////Decimales//////////////////
		Decimales decimales = new Decimales(3.123,3.123);
		System.out.println(decimales.areEqualByThreeDecimalPlaces());
	}
}
