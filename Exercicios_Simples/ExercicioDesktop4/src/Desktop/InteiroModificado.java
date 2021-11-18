package Desktop;

public class InteiroModificado {
	
int valor;
	
	void carregaValor(int v) {
		
		valor = v;
	}
	
	int devolveValor() {
		
		return valor;
	}
	
	int devolveValorAbsoluto() {
		
		return valor;
	}
	
	int imprime() {
		
		return valor;
	}
	
	int Soma(int v) {
		int res;
		res = (v + valor);
		return res;
	}
	
	int Subtrai(int v) {
		int res;
		res = (v - valor);
		return res;
	}

	int Multiplica(int v) {
		int res;
		res = (v * valor);
		return res;
	}
	
	String Divide(int v) {
		
		int res = v % 2;
		
		valor = 2;
		
		if(res == 0) {
			
		res = v / valor;
		
		return ""+res;
		
		}
		if(res == 1) {
			
			 return "valor não é divisivel "+ v;
		}
		
		return null;
		
	}
	
	

}
