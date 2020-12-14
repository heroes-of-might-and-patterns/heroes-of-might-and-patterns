package com.heroes.api;

import com.heroes.casillas.cCasillaNormal;
import com.heroes.dtos.CasillaDto;
import com.heroes.gestores.GestorTablero;
import com.heroes.mappers.CasillaMapper;
import com.heroes.tropas.productoConcreto.Arquero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("api")
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TableroController {

    private GestorTablero gestorTablero;
    private CasillaMapper casillaMapper;
    @Autowired
    public TableroController(){
        this.gestorTablero = new GestorTablero();
        this.gestorTablero.iniciarTablero();

        this.casillaMapper = new CasillaMapper();

        //Prueba
        Arquero a = new Arquero();
        a.setIdJugador("jug-1");

        Arquero a2 = new Arquero();
        a2.setIdJugador("jug-2");
        this.gestorTablero.getCasillas()[2].setTropa(a);
        this.gestorTablero.getCasillas()[3].setTropa(a);
        this.gestorTablero.getCasillas()[13].setTropa(a2);

    }

    /*@GetMapping("/p")
    public String getP(){
        return "Hola";
    }*/

    @GetMapping("/tablero")
    public cCasillaNormal[] getTablero()  {
        return this.gestorTablero.getCasillas();
    }

    @PutMapping("/tablero")
    public cCasillaNormal[] updateTablero(@Validated @NonNull @RequestBody CasillaDto[] tablero){

        this.gestorTablero.actualizarTablero(casillaMapper.CrearTablero(tablero));
        return this.gestorTablero.getCasillas();
    }

    @PutMapping("/pruebaPut")
    public String prueba(@Validated @NonNull @RequestBody CasillaDto c){
        System.out.println(c);
        return "s";
    }

}
