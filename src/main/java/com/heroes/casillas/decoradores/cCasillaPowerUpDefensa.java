package com.heroes.casillas.decoradores;

import com.heroes.casillas.aDecoradorCasilla;

public class cCasillaPowerUpDefensa extends aDecoradorCasilla {
	@Override
	public boolean pisada() {
		if(!casilla.estaVacia()) {
			// Aumentar defensa
		}
		return true;
	}
}