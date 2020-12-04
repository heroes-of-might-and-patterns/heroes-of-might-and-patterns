package com.heroes.defensas;

public class FabricaBallesta implements IFabricaDefensa{
    @Override
    public IDefensa crearDefensa() {
        Ballesta ballesta = new Ballesta();

        return ballesta;
    }
}
