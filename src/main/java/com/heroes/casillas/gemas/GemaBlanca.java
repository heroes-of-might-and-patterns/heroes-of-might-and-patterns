package com.heroes.casillas.gemas;

public class GemaBlanca extends AGema{

    private static final int oro = 1;
    private static final String color = "Blanca";

    public GemaBlanca() {
        this.setColor(this.color);
        this.setOro(this.oro);
    }


    @Override
    public AGema clone() {
        return new GemaBlanca();
    }
}
