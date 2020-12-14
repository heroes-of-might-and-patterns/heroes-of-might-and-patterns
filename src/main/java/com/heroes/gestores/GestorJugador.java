package com.heroes.gestores;

import com.heroes.Jugador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public class GestorJugador {

    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public void agregarJugadores(){

        Jugador jugador1 = new Jugador("1", "jugador1", 'p'); //p: pierde, g: gana
        Jugador jugador2 = new Jugador("2", "jugador2", 'p'); //p: pierde, g: gana

        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }



}
