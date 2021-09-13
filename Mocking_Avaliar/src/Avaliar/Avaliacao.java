package Avaliar;

import java.util.List;

public class Avaliacao {
	
	private EstudanteDAO estudanteDao;
	private MelhoresAlunos melhores;
	

	
	public void setEstudanteDao (EstudanteDAO estudanteDao) {
		this.estudanteDao = estudanteDao;
	}
	
	public void setMelhoresAlunos(MelhoresAlunos melhores) {
		this.melhores = melhores;
	}
	
	public List<Estudante> calcularStatusParaClasse(String codigoClasse) throws Exception{
		
		/*1*/if(!estudanteDao.validarCodigoClasse(codigoClasse))
			
			/*2*/throw new Exception ("Codigo da classe invalido.");
		
		/*3*/var estudantes = estudanteDao.pegarTodosEstudantesDaClasse(codigoClasse);
		
		/*4*/if(estudantes.size() == 0)
			
			/*5*/throw new Exception ("Lista de alunos vazia.");
		
		for(/*6*/int i = 0; /*7*/i < estudantes.size(); /*8*/i++) {
			
			if(/*9*/estudantes.get(i).getNotaprova() >= 6 && /*10*/estudantes.get(i).getNotatrabalho() >= 6)
				
				/*11*/ estudantes.get(i).setStatus("Aprovado");
			else
				/*12*/estudantes.get(i).setStatus("Reprovado");
			
			if(/*13*/melhores.getMedia(estudantes.get(i)) == 10)
				
				/*14*/estudantes.get(i).setStatus("Melhor Aluno");
			
		}
			
		/*15*/return estudantes;
	}
	
}