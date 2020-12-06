package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Jinete;

public class FabricaJinete implements IFabricaTropa {
	@Override
	public ITropa crearTropa() {
		Jinete jinete = new Jinete();

		return jinete;
	}
}
