package com.heroes.tropas.productoConcreto;

import com.heroes.tropas.productoAbstracto.ITropa;

public class Bersequer implements ITropa {

    private int precio;
    private int vida;
    private int cantMoviminetos;
    private int defensa;
    private int ptsAtaque;
    private int ptsAlcance;
    private int oroTransportado;
    private String nombre;

    public Bersequer() {
        this.nombre = "Bersequer";
        this.precio = 25;
        this.vida = 15;
        this.cantMoviminetos = 1;
        this.defensa = 10;
        this.ptsAtaque = 10;
        this.ptsAlcance = 2;
        this.oroTransportado = 0;
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
        if(vida < 0){
            this.vida = 0;
        }else {
            this.vida = vida;
        }
    }

    public int getCantMoviminetos() {
        return cantMoviminetos;
    }

    public void setCantMoviminetos(int cantMoviminetos) {
        this.cantMoviminetos = cantMoviminetos;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    public int getPtsAlcance() {
        return ptsAlcance;
    }

    public void setPtsAlcance(int ptsAlcance) {
        this.ptsAlcance = ptsAlcance;
    }

    public int getOroTransportado() {
        return oroTransportado;
    }

    public void setOroTransportado(int oroTransportado) {
        if(oroTransportado > 6){
            this.oroTransportado = 6;
        }else {
            this.oroTransportado = oroTransportado;
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public char getEstado() {
        return 0;
    }

    @Override
    public String obtenerIdJugador() {
        return null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ITropa atacarTropa(ITropa objetivo) {

        if( objetivo.defender(this.getPtsAtaque()) ){
            this.robarOro( objetivo.pasarOro() );
        }
        return objetivo;
    }

    @Override
    public void moverse(int cordX, int cordY) {

    }

    @Override
    public void robarOro(int oro) {
        if(oro > 6 && oro > 0){
            this.setOroTransportado(6);
        }else{
            this.setOroTransportado(oro);
        }
    }

    @Override
    public boolean defender(int ataque) {

        if(this.getDefensa() > ataque){
            this.setDefensa( this.defensa - ataque );
            return false;
        }else {
            ataque = ataque - this.getDefensa();
            this.setDefensa(0);
            this.setVida( this.getVida() - ataque );
            return this.getVida() == 0 ? true : false;
        }
    }

    @Override
    public int pasarOro() {
        return this.getOroTransportado();
    }
}
