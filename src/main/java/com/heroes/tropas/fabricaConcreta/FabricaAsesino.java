package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Asesino;

public class FabricaAsesino implements IFabricaTropa {

	@Override
	public ITropa crearTropa() {
		Asesino asesino = new Asesino();

		return asesino;
	}
}
