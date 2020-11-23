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
    void AtaqueDefensaArqueroAsesino() {

        asesino.setOroTransportado(3);

        arquero.atacarTropa(asesino);
        Assert.assertEquals(0 , asesino.getDefensa());

        arquero.atacarTropa(asesino);
        arquero.atacarTropa(asesino);
        arquero.atacarTropa(asesino);
        arquero.atacarTropa(asesino);

        Assert.assertEquals(0 , asesino.getVida());
        Assert.assertEquals(2 , arquero.getOroTransportado());

        asesino.atacarTropa(arquero);
        Assert.assertEquals(0 , arquero.getDefensa());

        asesino.atacarTropa(arquero);
        asesino.atacarTropa(arquero);
        asesino.atacarTropa(arquero);
        asesino.atacarTropa(arquero);

        Assert.assertEquals(0 , arquero.getVida());
        Assert.assertEquals(2 , asesino.getOroTransportado());

    }

    @Test
    void AtaqueDefensaEspadachinBersequer() {

        espadachin.setOroTransportado(2);

        bersequer.atacarTropa(espadachin);
        Assert.assertEquals(0 , espadachin.getDefensa());
        Assert.assertEquals(5 , espadachin.getVida());

        bersequer.atacarTropa(espadachin);
        Assert.assertEquals(2 , bersequer.getOroTransportado());

        espadachin.atacarTropa(bersequer);
        Assert.assertEquals(4 , bersequer.getDefensa());

        espadachin.atacarTropa(bersequer);
        Assert.assertEquals(13 , bersequer.getVida());

        espadachin.atacarTropa(bersequer);
        espadachin.atacarTropa(bersequer);
        espadachin.atacarTropa(bersequer);
        Assert.assertEquals(2 , espadachin.getOroTransportado());
    }

    @Test
    void AtaqueDefensaMagoJinete() {

        mago.setOroTransportado(3);

        jinete.atacarTropa(mago);
        Assert.assertEquals(0, mago.getDefensa());
        Assert.assertEquals(9, mago.getVida());

        jinete.atacarTropa(mago);
        jinete.atacarTropa(mago);
        jinete.atacarTropa(mago);
        Assert.assertEquals(2, jinete.getOroTransportado());

        mago.atacarTropa(jinete);
        Assert.assertEquals(0, jinete.getDefensa());
        Assert.assertEquals(8, jinete.getVida());

        mago.atacarTropa(jinete);
        mago.atacarTropa(jinete);
        Assert.assertEquals(2, mago.getOroTransportado());
    }

    @Test
    void AtaqueDefensaEspia() {

        espia.setOroTransportado(10);
        arquero.atacarTropa(espia);
        Assert.assertEquals(0, espia.getDefensa());
        Assert.assertEquals(0, espia.getVida());
        Assert.assertEquals(2, arquero.getOroTransportado());

        arquero.setDefensa(0);
        arquero.setVida(1);
        espia.atacarTropa(arquero);
        Assert.assertEquals(0, arquero.getVida());
        Assert.assertEquals(2, espia.getOroTransportado());
    }
}
