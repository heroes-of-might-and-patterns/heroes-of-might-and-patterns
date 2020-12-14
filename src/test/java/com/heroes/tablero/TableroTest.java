package com.heroes.tablero;

import com.heroes.casillas.cCasillaNormal;
import com.heroes.gestores.GestorTablero;
import com.heroes.tropas.productoConcreto.Arquero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    private GestorTablero gestorTablero;


    @BeforeEach
    void setUp(){
        gestorTablero = new GestorTablero();
    }

    @Test
    void iniciarTablero(){
        gestorTablero.iniciarTablero();

       // cCasillaNormal[] t = gestorTablero.getCasillas();
        gestorTablero.getCasillas()[2].setTropa(new Arquero());
        assertNotNull(gestorTablero.getCasillas());
    }

}
