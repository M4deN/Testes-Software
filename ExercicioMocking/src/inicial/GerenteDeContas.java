package inicial;

/**
 *
 * @author andreendo
 */
public interface GerenteDeContas {
    public long recuperarSaldo(Conta conta);
    
    public long efetuarSaque(Conta conta, long valor);
    
    public Conta acharConta(Cliente cliente);
}
