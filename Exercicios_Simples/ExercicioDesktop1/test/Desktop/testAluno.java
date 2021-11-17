package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAluno {

	@Test
	void testAlunoAprovado() {
		Aluno a = new Aluno();
		var res = a.AvaliacaoAluno(8.3, 8.8, 8.7, 9.1);
		assertEquals("aluno aprovado",res);
	}
	
	@Test
	void testAlunoRecuperacao() {
		Aluno a = new Aluno();
		var res = a.AvaliacaoAluno(3.3, 2.8, 3.7, 4.1);
		assertEquals("aluno de Recuperação",res);
	}
	
	@Test
	void testAlunoReprovado() {
		Aluno a = new Aluno();
		var res = a.AvaliacaoAluno(1.3, 2.8, 1.7, 2.1);
		assertEquals("aluno Reprovado",res);
	}
	
	@Test
	void testAlunoSemNota() {
		Aluno a = new Aluno();
		var res = a.AvaliacaoAluno(0.0, 0.0, 0.0, 0.0);
		assertEquals("aluno sem nota",res);
	}

}
