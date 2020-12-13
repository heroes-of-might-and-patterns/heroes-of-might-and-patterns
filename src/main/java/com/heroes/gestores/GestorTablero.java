package com.heroes.gestores;

import com.heroes.casillas.aDecoradorCasilla;
import com.heroes.casillas.cCasillaNormal;
import com.heroes.casillas.decoradores.cCasillaPowerUpAtaque;
import com.heroes.casillas.decoradores.cCasillaPowerUpDefensa;
import com.heroes.casillas.decoradores.cCasillaTrampaAtaque;
import com.heroes.casillas.decoradores.cCasillaTrampaDefensa;
import com.heroes.tropas.productoAbstracto.ITropa;

import java.util.ArrayList;

public class GestorTablero {

	private final GestorGemas gestorGemas = new GestorGemas();
	private final cCasillaNormal[] casillas = new cCasillaNormal[100];
	private ArrayList<ITropa> tropasEnEspera = new ArrayList<>();

	public GestorTablero() {

	}

	public cCasillaNormal[] getCasillas() {
		return casillas;
	}

	private void llenarCasillasNormales() {
		for (int i = 0; i < this.casillas.length; i++) {
			if (casillas[i] == null) {
				casillas[i] = new cCasillaNormal();
			}
		}
	}

	public void iniciarTablero() {
		ArrayList<Integer> casillasEspeciales = new ArrayList<>();
		while (casillasEspeciales.size() < 14) {
			int numero = (int) (Math.random() * 100);

			if (!casillasEspeciales.contains(numero))
				casillasEspeciales.add(numero);
		}

		for (int i = 0; i < casillas.length; i++) {
			if (casillasEspeciales.contains(i))
				decorarCasilla(i, (int) (Math.random() * 4));
		}

		poblarCasillasConGemas(casillasEspeciales);

		this.llenarCasillasNormales();
	}

	private void poblarCasillasConGemas(ArrayList<Integer> casillasEspeciales) {
		ArrayList<Integer> casillasGemas = new ArrayList<>();
		int numero;
		while (casillasGemas.size() < 15) {
			numero = (int) (Math.random() * 100);
			if (!casillasGemas.contains(numero) && !casillasEspeciales.contains(numero)) {
				this.casillas[numero].setGema(gestorGemas.getRandomGema());
				casillasGemas.add(numero);
			}
		}
	}

	// Para decorar las casillas PowerUp
	private void decorarCasilla(int x, int tipo) {
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

	private void decorarCasilla(int x, cCasillaNormal decorado) {
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


	/// Tropas
	public void crearTropa(ITropa tropa) {
		// Validar que se pueda  crear la tropa, o sea que no exista una tropa igual en espera que pertenezca al
		// mismo jugador

		this.tropasEnEspera.add(tropa);
	}

	private boolean verificarTropa(ITropa tropa) {

		for (ITropa t : this.tropasEnEspera) {
			// if( t.)

		}
		return true;
	}
}
