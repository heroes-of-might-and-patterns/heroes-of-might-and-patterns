package com.heroes.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TropaDto {
    private int precio;
    private int vida;
    private int cantMoviminetos;
    private int defensa;
    private int ptsAtaque;
    private int ptsAlcance;
    private int oroTransportado;
    private String nombre;
    private char estado;
    private String idJugador;



    public TropaDto() {
    }

    public TropaDto(@JsonProperty("precio") int precio,@JsonProperty("vida") int vida,@JsonProperty("cantMoviminetos") int cantMoviminetos,
                    @JsonProperty("defensa") int defensa, @JsonProperty("ptsAtaque") int ptsAtaque, @JsonProperty("ptsAlcance") int ptsAlcance,
                    @JsonProperty("oroTransportado") int oroTransportado, @JsonProperty("nombre") String nombre, @JsonProperty("estado") char estado,
                    @JsonProperty("idJugador") String idJugador) {
        this.precio = precio;
        this.vida = vida;
        this.cantMoviminetos = cantMoviminetos;
        this.defensa = defensa;
        this.ptsAtaque = ptsAtaque;
        this.ptsAlcance = ptsAlcance;
        this.oroTransportado = oroTransportado;
        this.nombre = nombre;
        this.estado = estado;
        this.idJugador = idJugador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantMoviminetos() {
        return cantMoviminetos;
    }

    public void setCantMoviminetos(int cantMoviminetos) {
        this.cantMoviminetos = cantMoviminetos;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    public int getPtsAlcance() {
        return ptsAlcance;
    }

    public void setPtsAlcance(int ptsAlcance) {
        this.ptsAlcance = ptsAlcance;
    }

    public int getOroTransportado() {
        return oroTransportado;
    }

    public void setOroTransportado(int oroTransportado) {
        this.oroTransportado = oroTransportado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }
}
