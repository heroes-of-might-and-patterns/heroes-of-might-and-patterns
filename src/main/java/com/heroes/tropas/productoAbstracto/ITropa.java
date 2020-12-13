package com.heroes.tropas.productoAbstracto;

public interface ITropa {
    public ITropa atacarTropa(ITropa objetivo);
    public void moverse(int cordX, int cordY);
    public void robarOro(int oro);
    public boolean defender(int ataque);
    public int pasarOro();
    public String getNombre();
    public char getEstado();
    public String obtenerIdJugador();
}
