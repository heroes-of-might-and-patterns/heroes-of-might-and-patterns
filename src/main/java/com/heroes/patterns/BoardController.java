package com.heroes.patterns;

import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;
import com.heroes.casillas.decoradores.cCasillaPowerUpAtaque;
import com.heroes.casillas.decoradores.cCasillaPowerUpDefensa;
import com.heroes.casillas.decoradores.cCasillaTrampaAtaque;
import com.heroes.casillas.decoradores.cCasillaTrampaDefensa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	private final cCasillaNormal[] casillas = new cCasillaNormal[100];

	public void decorarCasilla(int x, String tipo) {
		cCasillaNormal casilla = this.casillas[x];
		switch (tipo) {
			case "downDef":
				decorarCasilla(x, new cCasillaTrampaDefensa(casilla));
				break;
			case "upDef":
				decorarCasilla(x, new cCasillaPowerUpDefensa(casilla));
				break;
			case "downAtk":
				decorarCasilla(x, new cCasillaTrampaAtaque(casilla));
				break;
			case "upAtk":
				decorarCasilla(x, new cCasillaPowerUpAtaque(casilla));
				break;
		}
	}

	public void decorarCasilla(int x, cCasillaNormal decorado) {
		this.casillas[x] = decorado;
	}

	public void quitarDecorador(int x) {
		aDecoradorCasilla decorado = (aDecoradorCasilla) this.casillas[x];
		this.casillas[x] = decorado.getCasilla();
	}

	public void pisada(int x) {
		if (casillas[x].pisada()) {
			quitarDecorador(x);
		}
	}
}
