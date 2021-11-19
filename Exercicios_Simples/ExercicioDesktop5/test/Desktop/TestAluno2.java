package Desktop;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAluno2 {

	@Test
	void testMediaAprovado() {
		Aluno2 aluno = new Aluno2();
		aluno.Nota1(6.90);
		aluno.Nota2(7.80);
		aluno.Nota3(6.00);
		aluno.Nota4(5.60);
		var res = aluno.imprimeMedia();
		assertEquals("voce esta aprovado a sua média é 6.574999999999999",res);
		
	}
	
	@Test
	void testMediaReprovado() {
		Aluno2 aluno = new Aluno2();
		aluno.Nota1(2.90);
		aluno.Nota2(1.80);
		aluno.Nota3(2.00);
		aluno.Nota4(1.60);
		var res = aluno.imprimeMedia();
		assertEquals("voce esta reprovado a sua média é 2.075",res);
		
	}

}
