package inicial;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testClienteSemFundos1() {
		GerenteDeContas gerenteMock = mock(GerenteDeContas.class);
		
		Cliente cliente = new Cliente();
		cliente.setGerenteDeContas(gerenteMock);
		Conta conta = new Conta();
		when(gerenteMock.acharConta(any())).thenReturn(conta);
		when(gerenteMock.recuperarSaldo(conta)).thenReturn(700l);
		
		assertThrows(SemFundosException.class, () -> {
			cliente.efetuarSaque(1000);
		});
	}
	
	@Test
	void testClienteComFundos()throws Exception {
		GerenteDeContas gerenteMock = mock(GerenteDeContas.class);
		
		Cliente cliente = new Cliente();
		cliente.setGerenteDeContas(gerenteMock);
		Conta conta = new Conta();
		
		when(gerenteMock.acharConta(any())).thenReturn(conta);
		when(gerenteMock.recuperarSaldo(conta)).thenReturn(7000l, 6000l);
		
		long novoSaldo = cliente.efetuarSaque(1000);
		assertEquals(6000l,novoSaldo);
		
	}

}