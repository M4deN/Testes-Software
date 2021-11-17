package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOla {

	@Test
	void testOla1() {
		Ola oi = new Ola();
		var res = oi.cumprimenta(1);
		assertEquals("Olá, como você está??",res);
	}
	
	@Test
	void testOla2() {
		Ola oi = new Ola();
		var res = oi.cumprimenta(2);
		assertEquals("Oi tudo bem com você?",res);
	}
	
	@Test
	void testOla3() {
		Ola oi = new Ola();
		var res = oi.cumprimenta(3);
		assertEquals("Hi, how are you?",res);
	}

	@Test
	void testOla4() {
		Ola oi = new Ola();
		var res = oi.cumprimenta(4);
		assertEquals("digite um numero entre 1 e 3",res);
	}
}
