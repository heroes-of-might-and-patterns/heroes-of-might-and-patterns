package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Espadachin;

public class FabriaEspadachin implements IFabricaTropa {

	@Override
	public ITropa crearTropa() {
		Espadachin espadachin = new Espadachin();

		return espadachin;
	}

}
