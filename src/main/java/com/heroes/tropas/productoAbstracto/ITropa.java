package com.heroes.tropas.productoAbstracto;

public interface ITropa {
    public ITropa atacar(ITropa objetivo);
    public void moverse(int cordX, int cordY);
    public void robarOro(int oro);
    public void defender(int ataque);
}
