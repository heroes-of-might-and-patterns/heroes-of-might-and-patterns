package com.heroes.casillas.gemas;

public class GemaBlanca extends AGema {

	private static final int oro = 1;
	private static final String color = "Blanca";

	public GemaBlanca() {
		this.setColor(color);
		this.setOro(oro);
	}


	@Override
	public AGema clone() {
		return new GemaBlanca();
	}
}
