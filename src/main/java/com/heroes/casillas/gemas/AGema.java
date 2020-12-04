package com.heroes.casillas.gemas;

public abstract class AGema {
    private String color;
    private int oro;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public abstract AGema clone();

    @Override
    public String toString() {
        return "AGema:" +
                "color='" + color + '\'' +
                ", oro=" + oro;
    }
}
