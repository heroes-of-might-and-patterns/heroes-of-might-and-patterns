package com.heroes.tropas.fabricaConcreta;

import com.heroes.tropas.fabricaAbstracta.IFabricaTropa;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Arquero;

public class FabricaArquero implements IFabricaTropa {

    @Override
    public ITropa crearTropa() {
        Arquero arquero = new Arquero();

        return arquero;
    }
}
