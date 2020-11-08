package com.heroes.casillas.gemas;

public class GemaVerde extends AGema {

    private static final int oro = 3;
    private static final String color = "Verde";

    public GemaVerde() {
        this.setColor(this.color);
        this.setOro(this.oro);
    }

    @Override
    public AGema clone() {
        return new GemaVerde();
    }
}
