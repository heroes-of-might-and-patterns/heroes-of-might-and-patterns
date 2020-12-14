package com.heroes.gestores;

import com.heroes.casillas.gemas.AGema;
import com.heroes.casillas.gemas.GemaAzul;
import com.heroes.casillas.gemas.GemaBlanca;
import com.heroes.casillas.gemas.GemaVerde;

public class GestorGemas {
	private final AGema verde;
	private final AGema azul;
	private final AGema blanca;

	public GestorGemas() {
		blanca = new GemaBlanca();
		azul = new GemaAzul();
		verde = new GemaVerde();
	}

	/**
	 * @param tipo Recibe el tipo de gema que va a crear
	 *             1. Azul
	 *             2. Verde
	 *             3. Blanca
	 * @return
	 */
	public AGema crearGema(int tipo) {
		switch (tipo) {
			case 1: {
				return azul.clone();
			}
			case 2: {
				return verde.clone();
			}
			case 3: {
				return blanca.clone();
			}
			default:
				return null;
		}
	}

	public AGema getRandomGema() {
		int random = (int) (Math.random() * (3 - 1 + 1) + 1);
		return this.crearGema(random);
	}


}
