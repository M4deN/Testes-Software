package CaixaPreta;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CaixaPretaTest {

	@Test
	//{“alecio”, true"}
	void testSenhaNormal() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertTrue(verifica.validarNovaSenha("alecio"));
	}
	@Test
	//{“abcd”,false}
	void testMenosQue5Caracteres() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("abcd"));
	}
	@Test
	//{“12345678910”,false}
	void testMaior10Caracteres() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("12345678910"));
	}
	@Test
	//{“!abcde”,false”}
	void testSenhaCaracteresInvalido() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("!abcde"));
	}
	@Test
	//{“ab&&b”,false”}
	void testSenha1CaracterInvalido() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("ab&&b"));
	}
	@Test
	//{“alex”,false”}
	void testSenhaExisteNoDicionario() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("alex"));
	}
	//VALOR LIMITE
	@Test
	//{“abcde”,true}
	void testSenhaTamanho5() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertTrue(verifica.validarNovaSenha("abcde"));
	}
	@Test
	//{“123456789,true}
	void testSenhaTamanho9() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertTrue(verifica.validarNovaSenha("123456789"));
	}
	@Test
	//{“1234567891011,false}
	void testSenhaTamanho11() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("1234567891011"));
	}
	@Test
	//{“leandro”,false”}
	void testSenhaExisteNoDicionarioLeandro() {
		Dicionario dicmock = mock(Dicionario.class);
		ArrayList<String> dic = new ArrayList<String>();
		dic.add("alex");
		dic.add("leandro");
		when(dicmock.getListaDeSenhasInvalidas())
			.thenReturn(dic);
		VerificadorDeSenhas verifica = new VerificadorDeSenhas(dicmock);
		assertFalse(verifica.validarNovaSenha("leandro"));
	}
	
}
