package projeto;

public class Pagamento {
	
	
	public void PagamentoComun(Cliente cliente, double valor) {
		
		cliente.setValorConta(cliente.getValorConta() - valor);
		
	}
	
	
}
