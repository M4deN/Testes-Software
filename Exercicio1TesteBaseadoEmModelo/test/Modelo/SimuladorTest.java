package Modelo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimuladorTest {

	@Test
	void testStatus4Estados() {
		//Event A
		var event = new SimuladorDeEventos();
		//ESTADO 1
		event.eventA();
		//STATUS TRUE
		assertTrue(event.status());
		//EVENT B ESTADO 2
		event.eventB();
		//STATUS TRUE
		assertTrue(event.status());
		//EVENT C ESTADO 4
		event.eventC();
		//STATUS FALSE
		assertFalse(event.status());
		//EVENT D ESTADO 3
		event.eventD();
		//STATUS FALSE
		assertFalse(event.status());
	}
	@Test
	void testDemaisEventos() {
		//EVENT A
		var event = new SimuladorDeEventos();
		//ESTADO 1
		event.eventA();
		//STATUS TRUE
		assertTrue(event.status());
		//EVENT C 
		event.eventC();
		//STATUS FALSE ESTADO 4
		assertFalse(event.status());
		//EVENT A ESTADO 1
		event.eventA();
		//STATUS TRUE ESTADO 3
		assertTrue(event.status());
		//EVENT A INDO ESTADO 3
		event.eventA();
		//STATUS FALSE ESTADO 3
		assertFalse(event.status());
			
	}

}
