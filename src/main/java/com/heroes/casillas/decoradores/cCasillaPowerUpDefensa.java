package com.heroes.casillas.decoradores;

import com.heroes.casillas.aCasilla;
import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;

public class cCasillaPowerUpDefensa extends aDecoradorCasilla {
	public cCasillaPowerUpDefensa(aCasilla casilla) {
		this.casilla = casilla;
	}

	@Override
	public boolean pisada() {
		if(!casilla.estaVacia()) {
			// Aumentar defensa
		}
		return true;
	}
}
