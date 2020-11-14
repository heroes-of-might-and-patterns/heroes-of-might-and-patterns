package com.heroes.casillas.decoradores;

import com.heroes.casillas.aDecoradorCasilla;

public class cCasillaTrampaDefensa extends aDecoradorCasilla {
	@Override
	public boolean pisada() {
		if(!casilla.estaVacia()) {
			// Reducir defensa
		}
		return false;
	}
}
