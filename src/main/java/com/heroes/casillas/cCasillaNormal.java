package com.heroes.casillas;

import com.heroes.casillas.gemas.AGema;
import com.heroes.castillo.Castillo;
import com.heroes.tropas.productoAbstracto.ITropa;

public class cCasillaNormal {
	private Castillo castillo;
	private ITropa tropa;
	private AGema gema;

	public cCasillaNormal() {
	}

	public AGema getGema() {
		return gema;
	}

	public void setGema(AGema gema) {
		this.gema = gema;
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
