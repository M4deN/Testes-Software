package Avaliar;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AvaliacaoTest {

	@Test
	void testCodigoClasseInvalido(){
		EstudanteDAO estudanteDaoMock = mock(EstudanteDAO.class);
		when(estudanteDaoMock.validarCodigoClasse(anyString()))
			.thenReturn(false);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setEstudanteDao(estudanteDaoMock);
		
		assertThrows(Exception.class , () -> {
			avaliacao.calcularStatusParaClasse("ES51");
			});
		
	}
	
	@Test
	void testListaVazia() throws Exception {
		EstudanteDAO estudanteDaoMock = mock(EstudanteDAO.class);
		when(estudanteDaoMock.validarCodigoClasse(anyString()))
			.thenReturn(true);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setEstudanteDao(estudanteDaoMock);
		
		assertThrows(Exception.class , () -> {
			avaliacao.calcularStatusParaClasse("ES51");
			});

	}
	
	@Test
	void testAlunoAprovado() throws Exception {
		EstudanteDAO estudanteDaoMock = mock(EstudanteDAO.class);
		when(estudanteDaoMock.validarCodigoClasse(anyString()))
			.thenReturn(true);
		
		Estudante estudante = new Estudante(9,9);
		
		MelhoresAlunos melhoresAlunosMock = mock(MelhoresAlunos.class);
		when(melhoresAlunosMock.getMedia(estudante))
			.thenReturn(10d);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setEstudanteDao(estudanteDaoMock);
		avaliacao.setMelhoresAlunos(melhoresAlunosMock);
		
		List<Estudante> list = new ArrayList<Estudante>();
		list.add(estudante);
		
		when(estudanteDaoMock.pegarTodosEstudantesDaClasse(any()))
			.thenReturn(list);
		
		assertEquals(list, avaliacao.calcularStatusParaClasse(" "));	
		
	}
	
	@Test
	void testReprovado() throws Exception {
		EstudanteDAO estudanteDaoMock = mock(EstudanteDAO.class);
		when(estudanteDaoMock.validarCodigoClasse(anyString()))
			.thenReturn(true);
		
		Estudante estudante = new Estudante(4,4);
		Estudante estudante2 = new Estudante(6,1);
		
		MelhoresAlunos melhoresAlunosMock = mock(MelhoresAlunos.class);
		when(melhoresAlunosMock.getMedia(estudante))
			.thenReturn(10d);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setEstudanteDao(estudanteDaoMock);
		avaliacao.setMelhoresAlunos(melhoresAlunosMock);
		
		List<Estudante> list = new ArrayList<Estudante>();
		list.add(estudante);
		list.add(estudante2);
		
		when(estudanteDaoMock.pegarTodosEstudantesDaClasse(any()))
			.thenReturn(list);
		
		assertEquals(list,avaliacao.calcularStatusParaClasse(""));
		
	}
	
	@Test
	void testMelhorAluno() throws Exception {
		EstudanteDAO estudanteDaoMock = mock(EstudanteDAO.class);
		when(estudanteDaoMock.validarCodigoClasse(anyString()))
			.thenReturn(true);
		
		Estudante estudante = new Estudante(10,10);
		Estudante estudante2 = new Estudante(9,9);
		
		MelhoresAlunos melhoresAlunosMock = mock(MelhoresAlunos.class);
		when(melhoresAlunosMock.getMedia(estudante))
			.thenReturn(10d);	
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setEstudanteDao(estudanteDaoMock);
		avaliacao.setMelhoresAlunos(melhoresAlunosMock);
		
		List<Estudante> list = new ArrayList<Estudante>();
		list.add(estudante);
		list.add(estudante2);
		
		when(estudanteDaoMock.pegarTodosEstudantesDaClasse(any()))
			.thenReturn(list);
		
		assertEquals(list,avaliacao.calcularStatusParaClasse(""));	
	}

}
