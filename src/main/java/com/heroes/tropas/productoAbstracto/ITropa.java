package com.heroes.tropas.productoAbstracto;

public interface ITropa {
    public void atacar(ITropa objetivo);
    public void moverse(int cordX, int cordY);
    public void robarOro(int oro);
}
