package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Bersequer;

public class FabricaBersequer implements IFabricaTropa {

    @Override
    public ITropa crearTropa() {
        Bersequer bersequer = new Bersequer();

        return bersequer;
    }
}
