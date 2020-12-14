package com.heroes.observador.Interfaces;

public interface ISujeto {

    void addObserver(IObservador o);
    void notifyObservers();

    void setSinVida(boolean b);
}
