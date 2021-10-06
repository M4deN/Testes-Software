package Pack1;

public class Estatisticas {
	 int mulheres, homens;
	 float idadeMedia;
	 String contexto;
	 
	 public Estatisticas(int m, int h, float i, String c) {
		 this.mulheres = m;
		 this.homens = h;
		 this.idadeMedia = i;
		 this.contexto = c;
	}
	 public int getMulheres() {
		 return mulheres;
	 }
	 public int getHomens() {
		 return homens;
	 }
	 public float getIdadeMedia() {
		 return idadeMedia;
	 }
	 public String getContexto() {
		 return contexto;
	 }
}