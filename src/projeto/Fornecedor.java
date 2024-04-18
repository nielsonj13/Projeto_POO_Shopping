package projeto;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	
	private double valorConta;
	private int codigo;
	private String nome;
	private String CNPJ;
	private List<Produto> produtos = new ArrayList<>();;
	private Loja loja; 
	private Estacionamento estacionamento; 

	
	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	public Fornecedor(int codigo, String nome, String cNPJ, List<Produto> produtos, Loja loja, Estacionamento estacionamento, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		CNPJ = cNPJ;
		this.produtos = produtos;
		this.loja = loja;
		this.estacionamento = estacionamento;
		valorConta = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Estacionamento getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento = estacionamento;
	}

	public double getValorConta() {
		return valorConta;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	
	
}
