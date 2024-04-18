package projeto;

public final class Cliente extends Pessoa{
	
	private double ValorConta;
	private Carrinho carrinho;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nome, String cpf, int valorConta) {
		super(nome , cpf);
		ValorConta = valorConta;
	}
	
	public double getValorConta() {
		return ValorConta;
	}

	public void setValorConta(double d) {
		ValorConta = d;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	
	
}
