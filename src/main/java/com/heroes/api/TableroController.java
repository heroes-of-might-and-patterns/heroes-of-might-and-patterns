package com.heroes.api;

import com.heroes.casillas.cCasillaNormal;
import com.heroes.gestores.GestorTablero;
import com.heroes.tropas.productoConcreto.Arquero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("api")
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TableroController {

    private GestorTablero gestorTablero;

    @Autowired
    public TableroController(){
        this.gestorTablero = new GestorTablero();
        this.gestorTablero.iniciarTablero();

        //Prueba
        Arquero a = new Arquero();
        a.setIdJugador("jug-1");

        Arquero a2 = new Arquero();
        a2.setIdJugador("jug-2");
        this.gestorTablero.getCasillas()[2].setTropa(a);
        this.gestorTablero.getCasillas()[13].setTropa(a2);

    }

    @GetMapping("/p")
    public String getP(){
        return "Hola";
    }

    @GetMapping("/tablero")
    public cCasillaNormal[] getTablero()  {
        return this.gestorTablero.getCasillas();
    }


}
