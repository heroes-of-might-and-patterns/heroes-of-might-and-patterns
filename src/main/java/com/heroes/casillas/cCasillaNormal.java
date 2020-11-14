package com.heroes.casillas;

import com.heroes.castillo.Castillo;

public class cCasillaNormal {
	private Castillo castillo;

	public cCasillaNormal(){}

	public Castillo getCastillo() {
		return castillo;
	}

	public void setCastillo(Castillo castillo) {
		this.castillo = castillo;
	}

	public boolean estaVacia(){
		return this.castillo == null;
	}

	public boolean pisada() {
		return false;
	}
}
