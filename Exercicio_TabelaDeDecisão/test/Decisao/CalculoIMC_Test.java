package Decisao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoIMC_Test {

	@Test//CT1
	void testIMCMenor17()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(180, 50.00);
		assertEquals("Muito Abaixo do peso",res);
	}
	
	@Test//CT2
	void testIMCIntervalo17E18()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(180, 58.00);
		assertEquals("Abaixo do peso",res);
	}
	
	@Test//CT3
	void testIMCIntervalo18E24()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(170, 68.00);
		assertEquals("Peso Normal",res);
	}
	
	@Test//CT4
	void testIMCIntervalo25E29()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(180, 87.00);
		assertEquals("Acima do peso",res);
	}
	
	@Test//CT5
	void testIMCIntervalo30E34()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(190, 125.00);
		assertEquals("Obesidade I",res);
	}
	
	@Test//CT6
	void testIMCIntervalo35E39()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(162, 98.00);
		assertEquals("Obesidade II (severa)",res);
	}
	
	@Test//CT7
	void testIMCAcima40()throws Exception {
		var calc = new CalculoIMC();
		var res = calc.CalculadoraIMC(197, 168.00);
		assertEquals("Obesidade III (mórbida)",res);
	}
	
	@Test//CT8
	void testAlturaMenorQue120PesoMenor40(){
		var calc = new CalculoIMC();
		assertThrows(Exception.class , () -> {
			calc.CalculadoraIMC(119, 23.00);
		});
	}
	
	@Test//CT9
	void testAlturaMaiorQue250(){
		var calc = new CalculoIMC();
		assertThrows(Exception.class , () -> {
			calc.CalculadoraIMC(255, 187.00);
		});
	}
	
	@Test//CT10
	void testPesoMaiorQue200(){
		var calc = new CalculoIMC();
		assertThrows(Exception.class , () -> {
			calc.CalculadoraIMC(190, 202.00);
		});
	}
	

}
