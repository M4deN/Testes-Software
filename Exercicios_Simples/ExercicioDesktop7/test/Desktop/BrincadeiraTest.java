package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrincadeiraTest {

	@Test
	void testTrocaValores() {
		Brincadeiras b = new Brincadeiras();
		b.x1 = 10;
		b.x2 = 20;
		b.troca2Primeiros();
		var res = b.x1;
		var resp = b.x2;
		assertEquals(res, 20);
		assertEquals(resp, 10);
	}
	@Test
	void testImprime() {
		Brincadeiras b = new Brincadeiras();
		b.x1 = 10;
		b.x2 = 20;
		b.x3 = 30;
		
		var res = b.imprime();
		
		assertEquals(res, "102030");
		
	}
	
	@Test
	void testImprimeOrdemCrescente() {
		Brincadeiras b = new Brincadeiras();
		b.x1 = 40;
		b.x2 = 30;
		b.x3 = 10;
		
		var res = b.imprimeEmOrdemCrescente();
		
		assertEquals(res, "103040");
		
	}
	@Test
	void testImprimeOrdemImprovavel() {
		Brincadeiras b = new Brincadeiras();
		b.x1 = 0;
		b.x2 = 0;
		b.x3 = 0;
		
		var res = b.imprimeEmOrdemCrescente();
		
		assertEquals(res, "ordem improvavel");
		
	}
}
