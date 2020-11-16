package com.heroes.casillas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cCasillaNormalTest {
	private cCasillaNormal casillaNormal;

	@BeforeEach
	void setUp() {
		casillaNormal = new cCasillaNormal();
	}

	@Test
	void probarEstaVacia() {
		assertTrue(casillaNormal.estaVacia());
	}
}
