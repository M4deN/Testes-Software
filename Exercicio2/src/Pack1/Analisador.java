package Pack1;

import java.util.ArrayList;

public class Analisador {
	 public Estatisticas
	 analisar(ArrayList<Candidato> candidatos)
	 throws Exception {
	 if(candidatos == null || candidatos.isEmpty())
	 throw new Exception("lista nula ou vazia");

	 int fem = 0, masc = 0;
	 float idadeMedia = 0;
	 for (Candidato c : candidatos) {
	 if(c.getSexo() == 'F')
	 fem++;
	 else masc++;

	 idadeMedia += c.getIdade();
	 }

	 String contexto = "normal";
	 if(candidatos.size() == 1)
	 contexto = "sem concorrencia";
	 else if(candidatos.size() == 2)
	 contexto = "polarizada";

	 return new Estatisticas(fem, masc,idadeMedia / candidatos.size(), contexto);
	 }
}
