package com.heroes.defensas;

import com.heroes.tropas.productoAbstracto.ITropa;

public interface IDefensa {


    public boolean atacar(ITropa tropa); //falta el target de tipo tropa

    public boolean defender(int ataque);

}
