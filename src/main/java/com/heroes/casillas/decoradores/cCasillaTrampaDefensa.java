package com.heroes.casillas.decoradores;

import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;

public class cCasillaTrampaDefensa extends aDecoradorCasilla {
	public cCasillaTrampaDefensa(cCasillaNormal casilla) {
		this.casilla = casilla;
	}

	@Override
	public boolean pisada() {
		if (!casilla.estaVacia()) {
			// Reducir defensa
		}
		return false;
	}
}
