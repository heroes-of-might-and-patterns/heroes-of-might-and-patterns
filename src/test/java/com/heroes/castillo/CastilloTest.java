package com.heroes.castillo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CastilloTest {
	private Castillo castillo;
	@BeforeEach
	void setUp() {
		castillo = new Castillo();
	}

	@Test
	void reducirVidaConValorMenor() {
		int valor = castillo.getVida() - 2;
		int expected = castillo.getVida() - valor;
		castillo.reducirVida(valor);
		assertEquals(castillo.getVida(), expected);
	}

	@Test
	void reducirVidaConValorIgual() {
		int valor = castillo.getVida();
		castillo.reducirVida(valor);
		assertEquals(castillo.getVida(), 0);
	}

	@Test
	void reducirVidaConValorMayor() {
		castillo.reducirVida(castillo.getVida()+40);
		assertEquals(castillo.getVida(), 0);
	}

	@Test
	void reducirOroConValorMenor() {
		int valor = castillo.getOro() - 2;
		int expected = castillo.getOro() - valor;
		castillo.reducirOro(valor);
		assertEquals(castillo.getOro(), expected);
	}

	@Test
	void reducirOroConValorIgual() {
		int valor = castillo.getOro();
		castillo.reducirOro(valor);
		assertEquals(castillo.getOro(), 0);
	}

	@Test
	void reducirOroConValorMayor() {
		castillo.reducirOro(castillo.getOro()+40);
		assertEquals(castillo.getOro(), 0);
	}
}
