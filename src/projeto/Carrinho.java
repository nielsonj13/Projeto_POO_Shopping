package projeto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Itens> Itens = new ArrayList<>();

	public Carrinho() {
		// TODO Auto-generated constructor stub
	}
	
	public Carrinho(List<projeto.Itens> itens) {
		super();
		Itens = itens;
	}
	
	public List<Itens> getItens() {
		return Itens;
	}

	public void setItens(List<Itens> itens) {
		Itens = itens;
	}
	
	
	
	
	
}
