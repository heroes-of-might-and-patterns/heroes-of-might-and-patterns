package com.heroes.castillo;

public class Castillo {
	private int oro = 0, vida = 10;

	public Castillo(){

	}

	public int getOro() {
		return oro;
	}

	public int getVida() {
		return vida;
	}

	public void setOro(int oro) {
		this.oro = oro;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void reducirVida(int cantidad){
		if (cantidad > vida){
			this.vida = 0;
		}else {
			this.vida -= cantidad;
		}
	}

	public void reducirOro(int cantidad){
		if (cantidad > oro){
			this.oro = 0;
		}else {
			this.oro -= cantidad;
		}
	}
}
