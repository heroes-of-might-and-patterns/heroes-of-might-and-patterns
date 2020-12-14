package com.heroes.tropas.productoConcreto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.heroes.tropas.productoAbstracto.ITropa;

public class Arquero implements ITropa {
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


 public Arquero(){
        this.nombre = "Arquero";
        this.precio = 10;
        this.vida = 10;
        this.cantMoviminetos = 3;
        this.defensa = 3;
        this.ptsAtaque = 3;
        this.ptsAlcance = 4;
        this.oroTransportado = 0;
        this.estado = 'E';  // E: espera, A: activo, M: muerto
    }

    public Arquero(int precio, int vida, int cantMoviminetos, int defensa, int ptsAtaque, int ptsAlcance, int oroTransportado, String nombre, char estado, String idJugador) {
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

    /*    public Arquero(@JsonProperty("precio") int precio,@JsonProperty("vida") int vida,@JsonProperty("cantMoviminetos") int cantMoviminetos,
                   @JsonProperty("defensa") int defensa,@JsonProperty("ptsAtaque")int ptsAtaque,
                   @JsonProperty("ptsAlcance") int ptsAlcance, @JsonProperty("oroTransportado")int oroTransportado,
                   @JsonProperty("nombre") String nombre,@JsonProperty("estado") char estado,
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
    }*/

    public char getEstado() {
        return estado;
    }



    public void setEstado(char estado) {
        this.estado = estado;
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
        if(vida < 0){
            this.vida = 0;
        }else {
            this.vida = vida;
        }
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
        if(oroTransportado > 2){
            this.oroTransportado = 2;
        }else {
            this.oroTransportado = oroTransportado;
        }
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public ITropa atacarTropa(ITropa objetivo) {

        if( objetivo.defender(this.getPtsAtaque()) ){
            this.robarOro( objetivo.pasarOro() );
        }
        return objetivo;
    }

    @Override
    public void moverse(int cordX, int cordY) {

    }

    @Override
    public void robarOro(int oro) {
        if(oro > 2 && oro > 0){
            this.setOroTransportado(2);
        }else {
            this.setOroTransportado(oro);
        }
    }

    @Override
    public boolean defender(int ataque) {

        if(this.getDefensa() > ataque){
            this.setDefensa( this.defensa - ataque );
            return false;
        }else {
            ataque = ataque - this.getDefensa();
            this.setDefensa(0);
            this.setVida( this.getVida() - ataque );

            if(this.getVida() == 0){
                this.setEstado('M');
                return true;
            }else {
                return false;
            }

        }
    }

    @Override
    public int pasarOro() {
        return this.getOroTransportado();
    }

    @Override
    public String obtenerIdJugador() {
        return this.getIdJugador();
    }
}
