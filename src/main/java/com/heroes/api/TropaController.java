package com.heroes.api;


import com.heroes.casillas.cCasillaNormal;
import com.heroes.gestores.GestorTablero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api")
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
public class TropaController {

    private GestorTablero gestorTablero;

    @Autowired
    public TropaController() {
        this.gestorTablero = GestorTablero.getInstancia();
    }

     @GetMapping("/tropa")
    public cCasillaNormal[] getP(){
         return this.gestorTablero.getCasillas();
    }

}
