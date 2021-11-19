package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInteiroModificado {

	
	@Test
	void testCarregaESubtrai() {
		
		InteiroModificado inte = new InteiroModificado();
		inte.carregaValor(15);
		var res = inte.Subtrai(20);
		assertEquals(5,res);
	}
	
	@Test
	void testSoma() {
		
		InteiroModificado inte = new InteiroModificado();
		inte.carregaValor(15);
		var res = inte.Soma(10);
		assertEquals(25,res);
	}

	@Test
	void testSubtrai() {
		
		InteiroModificado inte = new InteiroModificado();
		inte.carregaValor(10);
		var res = inte.Subtrai(30);
		assertEquals(20,res);
	}
	
	@Test
	void testMultiplica() {
		
		InteiroModificado inte = new InteiroModificado();
		inte.carregaValor(25);
		var res = inte.Multiplica(25);
		assertEquals(625,res);
	}
	
	@Test
	void testDividiRestoDaDivisao0() {
		
		InteiroModificado inte = new InteiroModificado();
		inte.carregaValor(2);
		var res = inte.Divide(10);
		assertEquals("5",res);
	}
	
	@Test
	void testDividiRestoDaDivisao1() {
		
		InteiroModificado inte = new InteiroModificado();
		inte.carregaValor(2);
		var res = inte.Divide(37);
		assertEquals("valor não é divisivel 37",res);
	}
}
