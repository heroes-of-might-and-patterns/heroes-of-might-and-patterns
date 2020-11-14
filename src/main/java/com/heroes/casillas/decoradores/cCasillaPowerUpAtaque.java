package com.heroes.casillas.decoradores;

import com.heroes.casillas.aCasilla;
import com.heroes.casillas.aDecoradorCasilla;

public class cCasillaPowerUpAtaque extends aDecoradorCasilla {
	public cCasillaPowerUpAtaque(aCasilla casilla) {
		this.casilla = casilla;
	}

	@Override
	public boolean pisada() {
		if(!casilla.estaVacia()) {
			// Aumentar ataque
		}
		return true;
	}
}
