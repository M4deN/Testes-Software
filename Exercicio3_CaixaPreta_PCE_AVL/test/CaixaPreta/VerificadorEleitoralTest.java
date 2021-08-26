package CaixaPreta;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class VerificadorEleitoralTest {

	@Test
	void test01()throws Exception {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("12345678910"))
			.thenReturn("OK");
		var ver =  new VerificadorEleitoral(cartorio);
		var res = ver.consultarSituacao(19, "12345678910");
		assertEquals("voto obrigatorio", res);
		
	}
	
	@Test
	void test02()throws Exception {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("12345678910"))
			.thenReturn("OK");
		var ver =  new VerificadorEleitoral(cartorio);
		var res = ver.consultarSituacao(16, "12345678910");
		assertEquals("voto facultativo", res);
		
	}
	
	@Test
	void test03()throws Exception {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("12345678910"))
			.thenReturn("OK");
		var ver =  new VerificadorEleitoral(cartorio);
		var res = ver.consultarSituacao(15, "12345678910");
		assertEquals("nao pode votar", res);
		
	}
	
	@Test
	void test04()throws Exception {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("12345678910"))
			.thenReturn("OK");
		var ver =  new VerificadorEleitoral(cartorio);
		var res = ver.consultarSituacao(71, "12345678910");
		assertEquals("voto facultativo", res);
		
	}
	
	@Test
	void test05()throws Exception {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("01234567891"))
			.thenReturn("pendencia");
		var ver =  new VerificadorEleitoral(cartorio);
		var res = ver.consultarSituacao(71, "01234567891");
		assertEquals("regularize seu titulo", res);
		
	}
	
	@Test
	void test06()throws Exception {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("01234567891"))
			.thenReturn("nao existe");
		var ver =  new VerificadorEleitoral(cartorio);
		var res = ver.consultarSituacao(71, "01234567891");
		assertEquals("faca um titulo", res);
		
	}
	
	@Test
	void test07CPFCaracter1Mais() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("123456789101"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(19, "123456789101");
			});		
	}
	
	@Test
	void test08CPFFaltando1Caracter() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("1234567891"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(19, "1234567891");
			});		
	}
	
	@Test
	void test09Posição1CaracterIlegal() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("@1234567891"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(19, "@1234567891");
			});		
	}
	
	@Test
	void test10PosiçãoCentralCaracterIlegal() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("123456$89d0"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(19, "123456$89d0");
			});		
	}
	
	@Test
	void test11PosiçãoFinalCaracterIlegal() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("1234567891y"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(19, "1234567891y");
			});		
	}
	
	@Test
	void test12IdadeMenor0() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("12345678910"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(-1, "12345678910");
			});		
	}
	
	@Test
	void test13IdadeMaior200() {
		CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
		when(cartorio.verificar("12345678910"));
		var ver =  new VerificadorEleitoral(cartorio);
		assertThrows(Exception.class , () -> {
			ver.consultarSituacao(201, "12345678910");
			});		
	}
	//VALOR LIMITE
	
	@Test
	void test15Idade200()throws Exception {
			CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
			when(cartorio.verificar("01234567891"))
				.thenReturn("ok");
			var ver =  new VerificadorEleitoral(cartorio);
			var res = ver.consultarSituacao(200, "01234567891");
			assertEquals("voto facultativo", res);
	}
	
	@Test
	void test16Idade1()throws Exception {
			CartorioEleitoral cartorio = mock(CartorioEleitoral.class);
			when(cartorio.verificar("01234567891"))
				.thenReturn("ok");
			var ver =  new VerificadorEleitoral(cartorio);
			var res = ver.consultarSituacao(1, "01234567891");
			assertEquals("nao pode votar", res);
	}
	
}
