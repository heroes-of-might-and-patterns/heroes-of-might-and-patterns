package com.heroes.tropas;

import com.heroes.casillas.cCasillaNormal;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TropasTest {

    private Arquero arquero;
    private Asesino asesino;
    private Bersequer bersequer;
    private Espadachin espadachin;
    private Espia espia;
    private Jinete jinete;
    private Mago mago;


    @BeforeEach
    void setUp() {
        arquero = new Arquero();
        asesino = new Asesino();
        bersequer = new Bersequer();
        espadachin = new Espadachin();
        espia = new Espia();
        jinete = new Jinete();
        mago = new Mago();
    }

    @Test
    void atacarTropa() {

        asesino.setDefensa(0);
        asesino.setVida(2);
        asesino.setOroTransportado(3);

        arquero.atacarTropa(asesino);
        Assert.assertEquals(0 , asesino.getVida());
        Assert.assertEquals(2 , arquero.getOroTransportado());

    }
}
