package com.heroes.casillas;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.heroes.castillo.Castillo;
import com.heroes.tropas.productoAbstracto.ITropa;

public class cCasillaNormal {
	private Castillo castillo;
	private ITropa tropa;

	public cCasillaNormal() {
	}

	public cCasillaNormal(Castillo castillo,ITropa tropa) {
		this.castillo = castillo;
		this.tropa = tropa;
	}

	public ITropa getTropa() {
		return tropa;
	}

	public void setTropa(ITropa tropa) {
		this.tropa = tropa;
	}

	public Castillo getCastillo() {
		return castillo;
	}

	public void setCastillo(Castillo castillo) {
		this.castillo = castillo;
	}

	public boolean estaVacia() {
		return this.castillo == null;
	}

	public boolean pisada() {
		return false;
	}
}
