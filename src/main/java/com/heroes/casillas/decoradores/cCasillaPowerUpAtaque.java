package com.heroes.casillas.decoradores;

import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;

public class cCasillaPowerUpAtaque extends aDecoradorCasilla {
	public cCasillaPowerUpAtaque(cCasillaNormal casilla) {
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
