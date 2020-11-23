package com.heroes.tropas;


import com.heroes.tropas.productoConcreto.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(0 , asesino.getDefensa());

        arquero.atacarTropa(asesino);
        arquero.atacarTropa(asesino);
        arquero.atacarTropa(asesino);
        arquero.atacarTropa(asesino);

        assertEquals(0 , asesino.getVida());
        assertEquals(2 , arquero.getOroTransportado());

        asesino.atacarTropa(arquero);
        assertEquals(0 , arquero.getDefensa());

        asesino.atacarTropa(arquero);
        asesino.atacarTropa(arquero);
        asesino.atacarTropa(arquero);
        asesino.atacarTropa(arquero);

        assertEquals(0 , arquero.getVida());
        assertEquals(2 , asesino.getOroTransportado());

    }

    @Test
    void AtaqueDefensaEspadachinBersequer() {

        espadachin.setOroTransportado(2);

        bersequer.atacarTropa(espadachin);
        assertEquals(0 , espadachin.getDefensa());
        assertEquals(5 , espadachin.getVida());

        bersequer.atacarTropa(espadachin);
        assertEquals(2 , bersequer.getOroTransportado());

        espadachin.atacarTropa(bersequer);
        assertEquals(4 , bersequer.getDefensa());

        espadachin.atacarTropa(bersequer);
        assertEquals(13 , bersequer.getVida());

        espadachin.atacarTropa(bersequer);
        espadachin.atacarTropa(bersequer);
        espadachin.atacarTropa(bersequer);
        assertEquals(2 , espadachin.getOroTransportado());
    }

    @Test
    void AtaqueDefensaMagoJinete() {

        mago.setOroTransportado(3);

        jinete.atacarTropa(mago);
        assertEquals(0, mago.getDefensa());
        assertEquals(9, mago.getVida());

        jinete.atacarTropa(mago);
        jinete.atacarTropa(mago);
        jinete.atacarTropa(mago);
        assertEquals(2, jinete.getOroTransportado());

        mago.atacarTropa(jinete);
        assertEquals(0, jinete.getDefensa());
        assertEquals(8, jinete.getVida());

        mago.atacarTropa(jinete);
        mago.atacarTropa(jinete);
        assertEquals(2, mago.getOroTransportado());
    }

    @Test
    void AtaqueDefensaEspia() {

        espia.setOroTransportado(10);
        arquero.atacarTropa(espia);
        assertEquals(0, espia.getDefensa());
        assertEquals(0, espia.getVida());
        assertEquals(2, arquero.getOroTransportado());

        arquero.setDefensa(0);
        arquero.setVida(1);
        espia.atacarTropa(arquero);
        assertEquals(0, arquero.getVida());
        assertEquals(2, espia.getOroTransportado());
    }
}
