package com.heroes.defensas;

public class Ballesta {

    private int precio;
    private int vida;
    private int atkPuntos;
    private int atkAlcance;

    public Ballesta() {
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
}
