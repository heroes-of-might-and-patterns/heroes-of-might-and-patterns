package com.heroes.tropas.productoAbstracto;

public interface ITropa {
	ITropa atacar(ITropa objetivo);

	void moverse(int cordX, int cordY);

	void robarOro(int oro);

	void defender(int ataque);
}
