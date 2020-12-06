package com.heroes.casillas.gemas;

public class GemaAzul extends AGema {

	private static final int oro = 2;
	private static final String color = "Azul";

	public GemaAzul() {
		this.setColor(color);
		this.setOro(oro);
	}

	@Override
	public AGema clone() {
		return new GemaAzul();
	}
}
