package com.heroes.casillas.decoradores;

import com.heroes.casillas.aCasilla;
import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;

public class cCasillaTrampaAtaque extends aDecoradorCasilla {
	public cCasillaTrampaAtaque(aCasilla casilla) {
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
