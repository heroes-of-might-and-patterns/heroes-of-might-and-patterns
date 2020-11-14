package com.heroes.casillas;

import com.heroes.castillo.Castillo;

public abstract class aCasilla {
	private Castillo castillo;

	public aCasilla(){}

	public Castillo getCastillo() {
		return castillo;
	}

	public void setCastillo(Castillo castillo) {
		this.castillo = castillo;
	}

	public boolean estaVacia(){
		return this.castillo == null;
	}

	public abstract boolean pisada();
}
