package projeto;

public class Itens {

	private Produto Produto;
	private int quantidade;
	
	public Itens() {
		// TODO Auto-generated constructor stub
	}
	
	public Itens(Produto produto, int quantidade) {
		super();
		Produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return Produto;
	}
	public void setProduto(Produto produto) {
		Produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	} 
	
	
	
	
}
