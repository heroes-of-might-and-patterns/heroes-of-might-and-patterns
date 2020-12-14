package com.heroes.gestores;

import com.heroes.defensas.IDefensa;
import com.heroes.defensas.IFabricaDefensa;

import java.util.ArrayList;

public class GestorDefensa {

	private static final ArrayList<IDefensa> conjuntoDefensas = new ArrayList<IDefensa>();
	IFabricaDefensa fabrica;


	public GestorDefensa() {
	}

	public static void crearDefensa(IFabricaDefensa fabrica) {

		IDefensa defensa = fabrica.crearDefensa();
		agregarDefensa(defensa);

	}

	private static void agregarDefensa(IDefensa defensa) {
		conjuntoDefensas.add(defensa);
	}

}
