package Desktop;


public class Aluno2 {

double nota1, nota2, nota3,nota4;

	double Nota1(double n1) {
		
		return nota1 = n1;
	
	}

	double Nota2(double n2) {
		
		return  nota2 = n2;
	}
	

	double Nota3(double n3) {
		
		return nota3 = n3;
	}

	double Nota4(double n4) {
		
		return nota4 = n4;
	}
	
	String imprimeMedia() {
		
		double res;
		
		res = (nota1+nota2+nota3+nota4)/4;
		
		if(res >= 6)
			
		return ("voce esta aprovado a sua média é "+res);
		
		else
			
			return("voce esta reprovado a sua média é "+res);
	}
}