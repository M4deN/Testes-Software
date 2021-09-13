package Avaliar;

import java.util.List;

public interface EstudanteDAO {
	
	public boolean validarCodigoClasse(String codigoClasse);
	
	public List<Estudante> pegarTodosEstudantesDaClasse(String codigoClasse);
	
}
