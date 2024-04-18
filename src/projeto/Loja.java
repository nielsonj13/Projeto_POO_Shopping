package projeto;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private int cnpj;
	private String nome;
	Dono dono;
	Carrinho carrinho;
	List<Funcionario> funcionarios = new ArrayList<>();
	List<Produto> produtos = new ArrayList<>();
	private Itens pedido;
	
	public Loja() {
		// TODO Auto-generated constructor stub
	}

	public Loja(Dono dono, Carrinho carrinho, List<Funcionario> funcionarios, List<Produto> produtos, String nome, int cnpj, Itens pedido) {
		super();
		this.dono = dono;
		this.carrinho = carrinho;
		this.funcionarios = funcionarios;
		this.produtos = produtos;
		this.nome = nome;
		this.cnpj = cnpj;
		this.pedido = pedido;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public Itens getPedido() {
		return pedido;
	}

	public void setPedido(Itens pedido) {
		this.pedido = pedido;
	}
	
	

}
