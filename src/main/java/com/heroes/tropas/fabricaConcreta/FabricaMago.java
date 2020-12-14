package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Mago;

public class FabricaMago implements IFabricaTropa {


	@Override
	public ITropa crearTropa() {
		Mago mago = new Mago();

		return mago;
	}
}
