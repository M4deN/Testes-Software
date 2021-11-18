package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testInteiro {

	@Test
	void testCarregaERetornaValor() {
		Inteiro i = new Inteiro();
		 i.carregaValor(14);
		 var res =  i.devolveValor();
		 assertEquals(14,res);	
		
	}
	
	@Test
	void testValorNegativo() {
		Inteiro i = new Inteiro();
		 i.carregaValor(-473158);
		 var res =  i.devolveValor();
		 assertEquals(-473158,res);	
		
	}
	
	@Test
	void testValorAbsoluto() {
		Inteiro i = new Inteiro();
		 i.carregaValor(473158);
		 var res =  i.devolveValorAbsoluto();
		 assertEquals(473158,res);	
		
	}
	
	@Test
	void testImprime() {
		Inteiro i = new Inteiro();
		 i.carregaValor(-473158);
		 var res =  i.imprime();
		 assertEquals(-473158,res);	
		
	}

}
