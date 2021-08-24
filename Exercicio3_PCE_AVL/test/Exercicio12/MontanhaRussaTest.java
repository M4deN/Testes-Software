package Exercicio12;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class MontanhaRussaTest {

	@Test
	void testNomeEIdadeVálidos()throws Exception {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Alécio Leandro"))
			.thenReturn(true);
		var res = montanha.autorizar("Alécio Leandro", 25);
		assertEquals("autorizado",res);
		
	}
	
	@Test
	void testIdadeMenorQue18() throws Exception{
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Alécio Leandro"))
			.thenReturn(true);
		var res = montanha.autorizar("Amber Heard", 12);
		assertEquals("autorizado pelos pais",res);
		
	}
	@Test
	void testIdadeMaiorQue90() throws Exception{
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Alécio Leandro"))
			.thenReturn(true);
		var res = montanha.autorizar("Walter White", 93);
		assertEquals("acompanhado do responsavel legal",res);
		
	}
	@Test
	void testPrimeiroNome() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("65aléci Leandro"))
			.thenReturn(false);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("65aléci Leandro", 25);
			});
		
	}
	
	@Test
	void testSegundoNome() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Alécio le@ndr0"))
			.thenReturn(false);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("Alécio le@ndr0", 25);
			});
		
	}
	
	@Test
	void testUmNome() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Alécio"))
			.thenReturn(false);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("Alécio", 25);
			});
		
	}
	
	@Test
	void testNomeSemEspaço() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Alécioleandro"))
			.thenReturn(false);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("Alécioleandro", 25);
			});
		
	}
	
	@Test
	void testPrimeiraLetra() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("@lécio leandro"))
			.thenReturn(false);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("@lécio leandro", 25);
			});
		
	}
	
	@Test
	void testIdadeMenorQue0() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Baby Yoda"))
			.thenReturn(true);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("Baby Yoda", -1);
			});
		
	}
	@Test
	void testIdade0() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Luke Sky"))
			.thenReturn(true);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("Luke Sky", 0);
			});
		
	}

	@Test
	void testIdade2() throws Exception {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Junior Lima"))
			.thenReturn(true);
		var res = montanha.autorizar("Junior Lima", 2);
		assertEquals("autorizado pelos pais", res);
		
	}
	@Test
	void testIdade1() throws Exception{
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Sandy Junior"))
			.thenReturn(true);
		var res = montanha.autorizar("Sandy Junior", 1);
		assertEquals("autorizado pelos pais", res);
	}
	
	@Test
	void testIdade119() throws Exception{
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("João Silva"))
			.thenReturn(true);
		var res = montanha.autorizar("João Silva", 119);
		assertEquals("acompanhado do responsavel legal", res);
	}
	
	@Test
	void testIdade120() throws Exception{
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Antonio dias"))
			.thenReturn(true);
		var res = montanha.autorizar("Antonio dias", 120);
		assertEquals("acompanhado do responsavel legal", res);
	}
	
	@Test
	void testIdade121() {
	
		ClienteDao cliente = mock(ClienteDao.class);
		var montanha = new MontanhaRussaControlador(cliente);
		when(cliente.ehCliente("Luis Souza"))
			.thenReturn(true);
		assertThrows(Exception.class , () -> {
			montanha.autorizar("Luis Souza", 121);
			});
		
	}

}
