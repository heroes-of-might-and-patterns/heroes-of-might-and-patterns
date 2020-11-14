package com.heroes.casillas;

public abstract class aDecoradorCasilla {
	protected cCasillaNormal casilla;

	public aDecoradorCasilla() {
		this.casilla = new cCasillaNormal();
	}

	public abstract boolean pisada();
}
