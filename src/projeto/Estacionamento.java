package projeto;

public class Estacionamento {
	
	Pagamento pagamento;
	String Setor;
	
	public Estacionamento() {
		// TODO Auto-generated constructor stub
	}

	public Estacionamento( Pagamento pagamento, String setor) {
		super();
		this.pagamento = pagamento;
		Setor = setor;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public String getSetor() {
		return Setor;
	}

	public void setSetor(String setor) {
		Setor = setor;
	}
	
	
	
}
