package Pack1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnalisadorTest {

	@Test
	void Teste1(){
		Analisador analisador = new Analisador();
		ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
		assertThrows(Exception.class, () -> {analisador.analisar(candidatos);
		});
	}
	
	@Test
	void TestePolarizado()throws Exception {
		Analisador analisador = new Analisador();
		ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato ('F',30));
		candidatos.add(new Candidato ('M',40));
		
		Estatisticas e = analisador.analisar(candidatos);
		assertEquals(1, e.getMulheres());
		assertEquals(1, e.getHomens());
		assertEquals(35, e.getIdadeMedia(), 0.01);
		assertEquals("polarizada", e.getContexto());
	}
	
	@Test
	void TesteMaisMulheres()throws Exception {
		Analisador analisador = new Analisador();
		ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato ('F',30));
		candidatos.add(new Candidato ('M',40));
		candidatos.add(new Candidato ('F',35));
		
		Estatisticas e = analisador.analisar(candidatos);
		assertEquals(1, e.getHomens());
		assertEquals(2, e.getMulheres());
	}
}
