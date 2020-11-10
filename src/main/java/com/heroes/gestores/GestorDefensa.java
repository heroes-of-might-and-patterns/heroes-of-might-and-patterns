package com.heroes.gestores;

import com.heroes.defensas.IFabricaDefensa;

public class GestorDefensa {

    IFabricaDefensa fabrica;


    public GestorDefensa() {
    }

    public GestorDefensa(IFabricaDefensa fabrica) {
        this.fabrica = fabrica;
    }
}
