package com.heroes.defensas;


import com.heroes.tropas.productoAbstracto.ITropa;

public class Ballesta implements IDefensa{

	private int precio;
	private int vida;
	private int atkPuntos;
	private int atkAlcance;



    public Ballesta() {
        this.precio = 5;
        this.vida = 3;
        this.atkPuntos = 2;
        this.atkAlcance = 2;
    }


	public Ballesta(int precio, int vida, int atkPuntos, int atkAlcance) {
		this.precio = precio;
		this.vida = vida;
		this.atkPuntos = atkPuntos;
		this.atkAlcance = atkAlcance;
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtkPuntos() {
		return atkPuntos;
	}

	public void setAtkPuntos(int atkPuntos) {
		this.atkPuntos = atkPuntos;
	}

	public int getAtkAlcance() {
		return atkAlcance;
	}

	public void setAtkAlcance(int atkAlcance) {
		this.atkAlcance = atkAlcance;
	}

	@Override
	public String toString() {
		return "Ballesta{" +
				"precio=" + precio +
				", vida=" + vida +
				", atkPuntos=" + atkPuntos +
				", atkAlcance=" + atkAlcance +
				'}';
	}


    @Override
    public boolean atacar(ITropa tropa) {
      return tropa.defender(this.getAtkPuntos());



    }

    @Override
    public boolean defender(int ataque) {

        if (this.vida > ataque){
            this.setVida(this.getVida() - ataque);
            return true;
        }else{
            return false;
        }


    }

}
