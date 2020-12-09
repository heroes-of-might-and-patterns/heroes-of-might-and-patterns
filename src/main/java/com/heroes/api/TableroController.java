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
        this.gestorTablero.getCasillas()[2].setTropa(new Arquero());
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
