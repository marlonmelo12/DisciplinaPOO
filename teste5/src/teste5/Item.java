package teste5;

public class Item {
	private int codigo;
	private String nome;
	private double valorUnitario;
	private int quantidade;
	
	public Item() {
		this.codigo = 0;
		this.nome = "";
		this.valorUnitario = 0.0;
		this.quantidade = 0;
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

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calculoValorTotal() {
		double valorTotal = valorUnitario * quantidade;
		return valorTotal;
	}
}
