package com.heroes.casillas.decoradores;

import com.heroes.casillas.aCasilla;
import com.heroes.casillas.aDecoradorCasilla;

public class cCasillaTrampaDefensa extends aDecoradorCasilla {
	public cCasillaTrampaDefensa(aCasilla casilla) {
		this.casilla = casilla;
	}

	@Override
	public boolean pisada() {
		if(!casilla.estaVacia()) {
			// Reducir defensa
		}
		return false;
	}
}
