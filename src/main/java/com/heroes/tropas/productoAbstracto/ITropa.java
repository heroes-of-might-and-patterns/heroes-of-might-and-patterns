package com.heroes.tropas.productoAbstracto;

public interface ITropa {

    public abstract ITropa atacarTropa(ITropa objetivo);
    public abstract void moverse(int cordX, int cordY);
    public abstract void robarOro(int oro);
    public abstract boolean defender(int ataque);
    public abstract int pasarOro();
    public abstract String getNombre();
    public abstract char getEstado();
    public abstract String obtenerIdJugador();
}


