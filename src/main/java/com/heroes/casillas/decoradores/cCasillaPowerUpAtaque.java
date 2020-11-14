package com.heroes.casillas.decoradores;

import com.heroes.casillas.aDecoradorCasilla;

public class cCasillaPowerUpAtaque extends aDecoradorCasilla {
	@Override
	public void pisada() {
		if(!casilla.estaVacia()) {
			// Aumentar ataque
		}
	}
}
