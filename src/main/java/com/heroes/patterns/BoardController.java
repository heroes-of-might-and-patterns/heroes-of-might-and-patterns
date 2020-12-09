package com.heroes.patterns;

import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;
import com.heroes.casillas.decoradores.cCasillaPowerUpAtaque;
import com.heroes.casillas.decoradores.cCasillaPowerUpDefensa;
import com.heroes.casillas.decoradores.cCasillaTrampaAtaque;
import com.heroes.casillas.decoradores.cCasillaTrampaDefensa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

//@Controller
//@RequestMapping("/board")
public class BoardController {

	//Se implemento en GestorTablero
	/*private final cCasillaNormal[] casillas = new cCasillaNormal[100];

	@RequestMapping(value = "/iniciarTablero", method = RequestMethod.POST)
	public void iniciarTablero() {
		ArrayList<Integer> casillasEspeciales = new ArrayList<>();
		while (casillasEspeciales.size() < 15) {
			int numero = (int) (Math.random() / 100);
			if (!casillasEspeciales.contains(numero))
				casillasEspeciales.add(numero);
		}
		for (int i = 0; i < casillas.length; i++) {
			if (casillasEspeciales.contains(i))
				decorarCasilla(i, (int) (Math.random() / 4) + 1);
		}
	}

	public void decorarCasilla(int x, int tipo) {
		cCasillaNormal casilla = this.casillas[x];
		switch (tipo) {
			case 0:
				decorarCasilla(x, new cCasillaTrampaDefensa(casilla));
				break;
			case 1:
				decorarCasilla(x, new cCasillaPowerUpDefensa(casilla));
				break;
			case 2:
				decorarCasilla(x, new cCasillaTrampaAtaque(casilla));
				break;
			case 3:
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
	}*/
}
