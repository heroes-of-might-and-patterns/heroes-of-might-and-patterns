package com.heroes.mappers;

import com.heroes.dtos.TropaDto;
import com.heroes.tropas.productoAbstracto.ITropa;
import com.heroes.tropas.productoConcreto.Arquero;
import com.heroes.tropas.productoConcreto.Asesino;

public class TropaMapper {


    /*public TropaDto ITropaADto(ITropa t){
        return new TropaDto(t.getPrecio(), t.getVida(), t.getCantMoviminetos(),
                t.getDefensa(), t.getPtsAtaque(), t.getPtsAlcance(), t.getOroTransportado(),
                t.getNombre(), t.getEstado(), t.getIdJugador());
    }*/

    public ITropa DtoAITropa(TropaDto t){

        ITropa result = null;
        if(t != null){
            switch (t.getNombre()){

                case "Arquero":
                    result = new Arquero(t.getPrecio(), t.getVida(), t.getCantMoviminetos(),
                            t.getDefensa(), t.getPtsAtaque(), t.getPtsAlcance(), t.getOroTransportado(),
                            t.getNombre(), t.getEstado(), t.getIdJugador());
                    break;
                case "Asesino":

                    break;
            }
        }

        return result;
    }


}
