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
    private static GestorTablero instancia = null;


    public  GestorTablero() {

	}

    public static GestorTablero getInstancia() {
        if (instancia == null) {
            instancia = new GestorTablero();
        }
        return instancia;
    }

    public cCasillaNormal[] getCasillas() {
        return casillas;
    }

    public void actualizarTablero(cCasillaNormal[] tableroActualizado) {
        // Aca se podria implementar el patron observador para notificar a los jugadores
        for (int i = 0; i < this.casillas.length; i++) {
            this.casillas[i] = tableroActualizado[i];
        }
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
		int numero;
		while (casillasEspeciales.size() < 14) {
			numero = (int) (Math.random() * 100);

			if (!casillasEspeciales.contains(numero))
				casillasEspeciales.add(numero);
		}

		for (int i = 0; i < casillas.length; i++) {
			if (casillasEspeciales.contains(i))
				decorarCasilla(i, (int) (Math.random() * 4));
		}

		this.llenarCasillasNormales();

		poblarCasillasConGemas(casillasEspeciales);
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
				colocarCasillaDecorada(x, new cCasillaTrampaDefensa(casilla));
				break;
			case 1:
				colocarCasillaDecorada(x, new cCasillaPowerUpDefensa(casilla));
				break;
			case 2:
				colocarCasillaDecorada(x, new cCasillaTrampaAtaque(casilla));
				break;
			case 3:
				colocarCasillaDecorada(x, new cCasillaPowerUpAtaque(casilla));
				break;
		}
	}

    private void colocarCasillaDecorada(int x, cCasillaNormal decorado) {
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
    public void crearTropa(ITropa tropa ){
        // Validar que se pueda  crear la tropa, o sea que no exista una tropa igual en espera que pertenezca al
        // mismo jugador

        this.tropasEnEspera.add(tropa);
    }

    private boolean verificarTropa(ITropa tropa){

        for(ITropa t : this.tropasEnEspera){
           // if( t.)

        }
        return true;
    }

    public void atacarTropa(int indiceAtacante, int indiceObjetivo) {
        this.getCasillas()[indiceAtacante].getTropa().atacarTropa(this.getCasillas()[indiceObjetivo].getTropa());
        if (this.getCasillas()[indiceObjetivo].getTropa().getEstado() == 'M') {
            this.getCasillas()[indiceObjetivo] = new cCasillaNormal();
        }
    }


}
