package com.heroes.api;

import com.heroes.Jugador;
import com.heroes.gestores.GestorJugador;
import com.heroes.gestores.GestorTablero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("jugador")
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class JugadorController {


    ArrayList<Jugador> jugadores = new ArrayList<>();


    private GestorJugador gestorJugador;


    @PostMapping
    public void insertarJugadores(Jugador jugador){

        System.out.println(jugador.getNombre());

    }
}
