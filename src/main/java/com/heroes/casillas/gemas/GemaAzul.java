package com.heroes.casillas.gemas;

public class GemaAzul extends AGema{

    private static final int oro = 2;
    private static final String color = "Azul";

    public GemaAzul() {
        this.setColor(this.color);
        this.setOro(this.oro);
    }
    @Override
    public AGema clone() {
        return new GemaAzul();
    }
}
