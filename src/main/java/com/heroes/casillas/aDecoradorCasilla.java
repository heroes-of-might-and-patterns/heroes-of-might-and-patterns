package com.heroes.casillas;

public abstract class aDecoradorCasilla extends aCasilla {
	protected aCasilla casilla;

	public aDecoradorCasilla() {
		this.casilla = new cCasillaNormal();
	}
	
	public aCasilla getCasilla() {
		return casilla;
	}

	public void setCasilla(cCasillaNormal casilla) {
		this.casilla = casilla;
	}

	public abstract boolean pisada();
}
