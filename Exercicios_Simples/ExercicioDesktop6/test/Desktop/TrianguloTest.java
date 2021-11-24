package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianguloTest {

	@Test
	void testTrianguloRetangulo() {
		
		TrianguloRetangulo tri = new TrianguloRetangulo();
		var res = tri.defineLados(10, 20, 40);
		assertEquals(res,true);
	}

	@Test
	void testTrianguloRetanguloFalse() {
		
		TrianguloRetangulo tri = new TrianguloRetangulo();
		var res = tri.defineLados(30, 40, 30);
		assertEquals(res,false);
	}
	@Test
	void testTrianguloRetanguloMetodo2() {
		
		TrianguloRetangulo tri = new TrianguloRetangulo();
		var res = tri.defineLados1(30, 40, 90);
		assertEquals(res,true);
	}
	@Test
	void testTrianguloRetanguloMetodo2False() {
		
		TrianguloRetangulo tri = new TrianguloRetangulo();
		var res = tri.defineLados1(30, 40, 30);
		assertEquals(res,false);
	}
	@Test
	void testTrianguloRetanguloTesta2Metodos() {
		
		TrianguloRetangulo tri = new TrianguloRetangulo();
		TrianguloRetangulo tris = new TrianguloRetangulo();
		var res = tri.defineLados(30, 40, 80);
		var resp = tris.defineLados1(10, 15, 20);
		assertEquals(res,true);
		assertEquals(resp,false);
		
	}
	@Test
	void testTrianguloRetanguloTesta2MetodosDiferentes() {
		
		TrianguloRetangulo tri = new TrianguloRetangulo();
		TrianguloRetangulo tris = new TrianguloRetangulo();
		var res = tri.defineLados(50, 40, 80);
		var resp = tris.defineLados1(10, 10, 30);
		assertEquals(res,false);
		assertEquals(resp,true);
		
	}
}
