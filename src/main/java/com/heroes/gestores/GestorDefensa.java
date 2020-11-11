package com.heroes.gestores;

import com.heroes.defensas.IDefensa;
import com.heroes.defensas.IFabricaDefensa;

import java.util.ArrayList;

public class GestorDefensa {

    IFabricaDefensa fabrica;
    private static ArrayList<IDefensa> conjuntoDefensas = new ArrayList<IDefensa>();


    public GestorDefensa() {
    }

    public static void crearDefensa(IFabricaDefensa fabrica){

        IDefensa defensa = fabrica.crearDefensa();
        agregarDefensa(defensa);

    }

    private static void agregarDefensa(IDefensa defensa){
            conjuntoDefensas.add(defensa);
    }

}
