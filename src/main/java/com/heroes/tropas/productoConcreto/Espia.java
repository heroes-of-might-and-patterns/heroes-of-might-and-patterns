package com.heroes.tropas.productoConcreto;

import com.heroes.tropas.productoAbstracto.ITropa;

public class Espia implements ITropa {

    private int precio;
    private int vida;
    private int cantMoviminetos;
    private int defensa;
    private int ptsAtaque;
    private int ptsAlcance;
    private int oroTransportado;
    private String nombre;


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
        this.oroTransportado = oroTransportado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ITropa atacar(ITropa objetivo) {
        objetivo.defender(this.getPtsAtaque());
        return objetivo;
    }

    @Override
    public void moverse(int cordX, int cordY) {

    }

    @Override
    public void robarOro(int oro) {
        if(oro <= 10 && oro > 0){
            this.setOroTransportado(oro);
        }
    }

    @Override
    public void defender(int ataque) {

        if(this.getDefensa() < ataque){
            this.setDefensa( this.defensa - ataque );
        }else {
            this.setVida( ataque - this.getDefensa() );
            this.setDefensa(0);
        }
    }
}
