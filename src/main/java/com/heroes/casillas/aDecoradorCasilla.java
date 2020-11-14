package com.heroes.casillas;

public abstract class aDecoradorCasilla extends cCasillaNormal {
	protected cCasillaNormal casilla;

	public aDecoradorCasilla() {
		this.casilla = new cCasillaNormal();
	}
	
	public cCasillaNormal getCasilla() {
		return casilla;
	}

	public void setCasilla(cCasillaNormal casilla) {
		this.casilla = casilla;
	}

	public abstract boolean pisada();
}
