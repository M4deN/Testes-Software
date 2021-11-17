package Desktop;

public class Aluno {
	
	String AvaliacaoAluno(double p1, double p2, double p3, double p4) {
		
	double media;
	
	 media = (p1+p2+p3+p4)/4;
	 
	 if(media >= 8.14) {
		 
		 return ("aluno aprovado");
	 }
	if(media > 2.3 && media <= 4.3) {
		
		return "aluno de Recuperação";
	}
	
	if(media > 0.0 && media <= 2.9) {
		
		return "aluno Reprovado";
	}
	 else
		 return "aluno sem nota";

	}
}
