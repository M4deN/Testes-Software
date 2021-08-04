package CaixaPreta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class BancoTest {

	@Test
	//{“IF66J”,“EB66”,20,”sucesso”}
	void testSucesso() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 20);
		assertEquals("sucesso",res);
		
	}
	@Test
	//{“IF66%”,“EB66”,20,”codigo disciplina invalido”}
	void testCodigoDiscplinaInvalido() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66%"))
			.thenReturn(false);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 20);
		assertEquals("codigo disciplina invalido",res);
		
	}
	@Test
	//{"IF66J","34EJ",20,"código turma invalido”}
	void testCodigoTurmaInvalido() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("34EJ"))
			.thenReturn(false);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 20);
		assertEquals("código turma invalido",res);
		
	}
	@Test
	//{"IF66J","EB66",1,"número de alunos abaixo”}
	void testNumeroDeAlunosAbaixo3() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("34EJ"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 1);
		assertEquals("número de alunos abaixo",res);
		
	}
	@Test
	//{"IF66J","EB66",45,"número de alunos acima”}
	void testNumeroDeAlunosAcima44() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("34EJ"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 45);
		assertEquals("número de alunos acima",res);
		
	}

	//VALOR LIMITE
	@Test
	//{“IF66J”,“EB66”,3,”sucesso”}
	void testNumeroDeAlunos3() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 3);
		assertEquals("sucesso",res);
		
	}
	@Test
	//{“IF66J”,“EB66”,4,”sucesso”}
	void testNumeroDeAlunos4() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 4);
		assertEquals("sucesso",res);
		
	}
	@Test
	//{“IF66J”,“EB66”,2,”numero de alunos abaixo”}
	void testNumeroDeAlunos2() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 2);
		assertEquals("numero de alunos abaixo",res);
		
	}
	@Test
	//{“IF66J”,“EB66”,44,”sucesso”}
	void testNumeroDeAlunos44() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 44);
		assertEquals("sucesso",res);
		
	}
	@Test
	//{“IF66J”,“EB66”,43,”sucesso”}
	void testNumeroDeAlunos43() {
		VerificadorDeCodigos vermock = mock(VerificadorDeCodigos.class);
		when(vermock.verificarCodigoDisciplina("IF66J"))
			.thenReturn(true);
		when(vermock.verificarCodigoTurma("EB66"))
			.thenReturn(true);
		BancoDeDados banco = new BancoDeDados(vermock);
		String res = banco.cadastrarTurma("IF66J", "EB66", 43);
		assertEquals("sucesso",res);
		
	}
}
