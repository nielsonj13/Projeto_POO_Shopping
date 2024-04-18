package projeto;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
	
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	List<Estacionamento> estacionamento= new ArrayList<>();
	private String nome;
	private int CNPJ;
	List<Andar> andares = new ArrayList<>();;
	
	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	public Shopping(List<Estacionamento> estacionamento, String nome, int cNPJ, List<Andar> andares, List<Fornecedor> fornecedores) {
		super();
		this.estacionamento = estacionamento;
		this.nome = nome;
		CNPJ = cNPJ;
		this.andares = andares;
		this.fornecedores= fornecedores;
	}

	public List<Estacionamento> getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(List<Estacionamento> estacionamento) {
		this.estacionamento = estacionamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public List<Andar> getAndares() {
		return andares;
	}

	public void setAndares(List<Andar> andares) {
		this.andares = andares;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
}
