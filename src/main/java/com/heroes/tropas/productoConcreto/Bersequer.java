package com.heroes.tropas.productoConcreto;

import com.heroes.tropas.productoAbstracto.ITropa;

public class Bersequer implements ITropa {

    private int precio;
    private int vida;
    private int cantMoviminetos;
    private int defensa;
    private int ptsAtaque;
    private int ptsAlcance;
    private int oroTrasportable;
    private String nombre;

    @Override
    public void atacar(ITropa objetivo) {

    }

    @Override
    public void moverse(int cordX, int cordY) {

    }

    @Override
    public void robarOro(int oro) {

    }
}
