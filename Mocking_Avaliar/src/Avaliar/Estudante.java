package Avaliar;

public class Estudante {

	private double notaprova;
	private double notatrabalho;
	private String status;
	
	public Estudante(double notaprova, double notatrabalho) {
		this.notaprova = notaprova;
		this.notatrabalho = notatrabalho;
	}
		public double getNotaprova() {
			
			return notaprova;
		}
		
		public double getNotatrabalho() {
			
			return notatrabalho;
		}
		
		public void setNotaProva(double notaProva) {
			this.notaprova = notaProva;
		}
		
		public void setNotaTrabalho(double notaTrabalho) {
			this.notatrabalho = notaTrabalho;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}
	
}


