package teste5;

import java.util.List;
import java.util.ArrayList;

public class CupomFiscal {
	private String nomeLoja;
	private String cnpj;
	private double totalPago;
	private String cpfConsumidor;
	private String cnpjConsumidor;
	private double dinheiroRecebido;
	private double troco;
	private List<Item> listaItem;
	
	public CupomFiscal() {
		this.nomeLoja = "";
		this.cnpj = "";
		this.totalPago = 0.0;
		this.cpfConsumidor = "";
		this.cnpjConsumidor = "";
		this.dinheiroRecebido = 0.0;
		this.troco = 0.0;
		this.listaItem = new ArrayList<>();
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}

	public String getCpfConsumidor() {
		return cpfConsumidor;
	}

	public void setCpfConsumidor(String cpfConsumidor) {
		this.cpfConsumidor = cpfConsumidor;
	}

	public String getCnpjConsumidor() {
		return cnpjConsumidor;
	}

	public void setCnpjConsumidor(String cnpjConsumidor) {
		this.cnpjConsumidor = cnpjConsumidor;
	}

	public double getDinheiroRecebido() {
		return dinheiroRecebido;
	}

	public void setDinheiroRecebido(double dinheiroRecebido) {
		this.dinheiroRecebido = dinheiroRecebido;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public List<Item> getListaItem() {
		return listaItem;
	}

	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}
	public void adicionarItem(Item item) {
		listaItem.add(item);
	}
}
