package com.heroes.observador.Concreto;

import com.heroes.castillo.Castillo;
import com.heroes.observador.Interfaces.IObservador;

public class Observador implements IObservador {
    @Override
    public void update(Castillo castillo) {
        castillo.setSinVida(true);

    }
}
