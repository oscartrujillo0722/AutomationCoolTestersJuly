package com.poo;

public class perro {

	int numpatas;
	String color, tamano, raza;
	
	public perro(int numpatas,String color, String tamano, String raza) {
		this.numpatas = numpatas;
		this.color = color;
		this.tamano=tamano;
		this.raza =raza;
	}
		
		public String getRaza()
		{ 
			return this.raza;
		}
		public void setRaza(String raza) {
			this.raza=raza;
		}

	}


