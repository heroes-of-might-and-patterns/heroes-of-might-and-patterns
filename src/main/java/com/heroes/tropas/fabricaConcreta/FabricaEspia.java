package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Espia;

public class FabricaEspia implements IFabricaTropa {

    @Override
    public ITropa crearTropa() {
        Espia espia = new Espia();

        return espia;
    }
}
