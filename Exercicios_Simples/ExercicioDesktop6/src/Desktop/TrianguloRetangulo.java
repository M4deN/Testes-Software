package Desktop;

public class TrianguloRetangulo {

	boolean defineLados(double x1,double x2, double x3){
		
		if(x1 > x3) {
			
			return false;
		}
		else if(x2 > x3) {
			
			return false;
			
		}else  if(x1 + x2 < x3) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	boolean defineLados1(double x1,double x2, double x3){
	
		if(x1 + x2 < x3) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
		
}
