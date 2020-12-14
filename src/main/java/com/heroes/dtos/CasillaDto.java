package com.heroes.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CasillaDto {
    private TropaDto tropa;
    private CasillaDto castillo;


    public CasillaDto() {

    }

    public CasillaDto(@JsonProperty("tropa") TropaDto tropa,@JsonProperty("castillo") CasillaDto castillo) {
        this.tropa = tropa;
        this.castillo = castillo;
    }

    public TropaDto getTropa() {
        return tropa;
    }

    public void setTropa(TropaDto tropa) {
        this.tropa = tropa;
    }

    public CasillaDto getCastillo() {
        return castillo;
    }

    public void setCastillo(CasillaDto castillo) {
        this.castillo = castillo;
    }
}
