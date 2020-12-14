package com.heroes.castillo;

import com.heroes.observador.Concreto.Observador;
import com.heroes.observador.Interfaces.IObservador;
import com.heroes.observador.Interfaces.ISujeto;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class Castillo implements ISujeto {
	private int oro = 20, vida = 30;
	private boolean sinVida;
	ArrayList<IObservador> observadors = new ArrayList<>();

	public Castillo() {
		addObserver(new Observador());
	}

	public Castillo(@JsonProperty("oro") int oro,@JsonProperty("vida") int vida) {
		this.oro = oro;
		this.vida = vida;
		addObserver(new Observador());
	}

	public int getOro() {
		return oro;
	}

	public void setOro(int oro) {
		this.oro = oro;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void reducirVida(int cantidad) {
		if (cantidad > vida) {
			this.vida = 0;
			notifyObservers();
		} else {
			this.vida -= cantidad;
		}
	}

	public void reducirOro(int cantidad) {
		if (cantidad > oro) {
			this.oro = 0;
		} else {
			this.oro -= cantidad;
		}
	}

	public boolean isSinVida() {
		return sinVida;
	}

	public void setSinVida(boolean sinVida) {
		this.sinVida = sinVida;
	}

	@Override
	public void addObserver(IObservador o) {
		observadors.add(o);
	}

	@Override
	public void notifyObservers() {
		for(IObservador o: observadors)
			o.update(this);
	}
}
