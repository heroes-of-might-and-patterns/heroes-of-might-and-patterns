package com.heroes.observador.Concreto;

import com.heroes.castillo.Castillo;
import com.heroes.observador.Interfaces.IObservador;
import com.heroes.observador.Interfaces.ISujeto;

public class Observador implements IObservador {
    @Override
    public void update(ISujeto castillo) {
        castillo.setSinVida(true);
    }
}
