package inicial;

public class Turma {

	String codDisciplina, codTurma;
	int maximoAlunos;
	
	//adicionar os getters e setters
	public void setcodDisciplina(String coddisciplina){
	
	       this.codDisciplina = coddisciplina;
	   }
	public void setcodTurma(String codturma){
	
	       this.codTurma = codturma;
	   }
	public void setmaximoAlunos(int maximoalunos){
	
	       this.maximoAlunos = maximoalunos;
	   }
	
	public int getmaximoAlunos(){
	       
	       return maximoAlunos;
	   }
	public String getCodDisciplina() {
	   
		   return codDisciplina;
	   }
	public String getCodTurma() {
	 
		   return codTurma;
	   }
}

