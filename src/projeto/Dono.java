package projeto;

import java.util.Random;
import java.util.Scanner;

public final class Dono extends Pessoa {
	
	int codigo;
	private double saldo;
	private Loja loja;

	
	public Dono() {
		// TODO Auto-generated constructor stub
	}
	
	public Dono(String nome, String cpf, int codigo, double saldo, Loja loja ) {
		super (nome, cpf);
		this.codigo = codigo;
		this.saldo = saldo;
		this.loja = loja;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	private void listProdutos() {
		
		System.out.println("\nProdutos da Sua Loja: ");
		for (int i = 0; i < loja.getProdutos().size(); i++) {
			System.out.println( (i+1) + "- " + loja.getProdutos().get(i).getNome());
		}
		
		
		
	}

	public Itens pedidoProd() {
		
		Scanner sc = new Scanner(System.in);
		listProdutos();
		System.out.print("\nDigite Aqui qual produtos o senhor deseja fazer um pedido: ");
		int opcao_prod = sc.nextInt();
		System.out.print("Digite Aqui a quantidade de produtos: ");
		int quant= sc.nextInt();
		
		Itens itens = new Itens();
		if (opcao_prod == 1) {
			
			itens.setProduto(loja.getProdutos().get(0));
			itens.setQuantidade(quant);
			
			
		} else if (opcao_prod== 2){
			
			itens.setProduto(loja.getProdutos().get(1));
			itens.setQuantidade(quant);
			
			
		} else if (opcao_prod ==3 ) {
			
			itens.setProduto(loja.getProdutos().get(3));
			itens.setQuantidade(quant);
			
		}
		
		
		return itens;
		
		
	}
	
	
}