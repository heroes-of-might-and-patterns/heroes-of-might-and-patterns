package com.heroes.defensas;

public class FabricaCatapulta implements IFabricaDefensa {
	@Override
	public IDefensa crearDefensa() {
		Catapulta catapulta = new Catapulta();

		return catapulta;
	}
}
