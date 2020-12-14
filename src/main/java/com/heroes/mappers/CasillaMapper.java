package com.heroes.mappers;

import com.heroes.casillas.cCasillaNormal;
import com.heroes.dtos.CasillaDto;

public class CasillaMapper {
    private TropaMapper tropaMapper;

    public CasillaMapper() {
        this.tropaMapper = new TropaMapper();
    }

    public cCasillaNormal DtoAcCasillaNormal(CasillaDto c){
        cCasillaNormal result = new cCasillaNormal();
        result.setTropa(tropaMapper.DtoAITropa(c.getTropa()));
       // Hacer lo mismo para castillo
        result.setCastillo(null);

        return result;
    }

    public cCasillaNormal[] CrearTablero(CasillaDto[] t){
        cCasillaNormal[] result = new cCasillaNormal[100];
        for(int i = 0; i< t.length; i++){
            result[i] = this.DtoAcCasillaNormal(t[i]);
        }

        return result;
    }

    /*public CasillaDto cCasillaADto(cCasillaNormal c){
        CasillaDto result = new CasillaDto(c.getTropa(), c.getCastillo());
    }*/
}
