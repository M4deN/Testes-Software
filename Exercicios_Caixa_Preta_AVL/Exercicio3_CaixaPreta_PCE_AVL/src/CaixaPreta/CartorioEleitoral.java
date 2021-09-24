package CaixaPreta;

public interface CartorioEleitoral {

	/** Esse método pode retornar:
	 * - "nao existe": se o cpf não possui titulo associado
	 * - "pendencia": o titulo possui alguma pendencia
	 * - "OK": situacao regularizada para o título */
	 public String verificar(String cpf);
}
