package Desktop;

public class Brincadeiras {

	int x1, x2, x3, x4;
	
	void troca2Primeiros(){
		 x4 = x1;
		 x1 = x2;
		 x2 = x4;
	 }
	
	String imprime() {
		
		return ""+ x1 + x2 + x3;
	}
	String imprimeEmOrdemCrescente(){
		
		if(x1 < x2 && x2 < x3) {
			
			return ""+ x1 + x2 + x3;
		}
		else if(x2 < x1 && x1 < x3) {
			
			return ""+ x2 + x1 + x3;
		}
		else if(x3 < x1 && x1 < x2) {
			
			return ""+ x3 + x1 + x2;
		}
		else if(x3 < x2 && x2 < x1) {
			
			return ""+ x3 + x2 + x1;
		}
		else if(x1 > x2 && x2 < x3) {
			
			return ""+ x2 + x3 + x1;
		}

		else {
			return "ordem improvavel";
		}
	}
}
