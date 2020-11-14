package com.heroes.casillas.gestores;

import com.heroes.casillas.aCasilla;
import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.decoradores.cCasillaPowerUpAtaque;
import com.heroes.casillas.decoradores.cCasillaPowerUpDefensa;
import com.heroes.casillas.decoradores.cCasillaTrampaAtaque;
import com.heroes.casillas.decoradores.cCasillaTrampaDefensa;

public class cGestorCasillas {
	private aCasilla[][] casillas = new aCasilla[10][10];

	public void decorarCasilla(int x, int y, String tipo){
		aCasilla casilla = this.casillas[x][y];
		switch (tipo){
			case "downDef":
				decorarCasilla(x,y,new cCasillaTrampaDefensa(casilla));
				break;
			case "upDef":
				decorarCasilla(x,y,new cCasillaPowerUpDefensa(casilla));
				break;
			case "downAtk":
				decorarCasilla(x,y,new cCasillaTrampaAtaque(casilla));
				break;
			case "upAtk":
				decorarCasilla(x,y,new cCasillaPowerUpAtaque(casilla));
				break;
		}
	}
	
	public void decorarCasilla(int x, int y, aDecoradorCasilla decorado){
		this.casillas[x][y] = decorado;
	}

	public void quitarDecorador(int x, int y){
		aDecoradorCasilla decorado = (aDecoradorCasilla) this.casillas[x][y];
		this.casillas[x][y] = decorado.getCasilla();
	}
	
	public void pisada(int x, int y){
		if (casillas[x][y].pisada()){
			quitarDecorador(x, y);
		}
	}
}
