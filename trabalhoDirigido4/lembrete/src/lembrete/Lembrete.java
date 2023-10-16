package lembrete;

public class Lembrete {
	private String descricao;
	private int dia;
	private int mes;
	private int ano;
	
	public Lembrete(String descricao, int dia, int mes, int ano){
		this.descricao = descricao;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Lembrete() {
		this.descricao = "";
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean equals(Lembrete lembrete) {
		if (this == lembrete)
			return true;
		if (lembrete == null)
			return false;
		if (getClass() != lembrete.getClass())
			return false;
		Lembrete other = (Lembrete) lembrete;
		if (ano != other.ano)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public String toString() {
		return "Descrição: " + descricao + " - " + dia + "/" + mes + "/" + ano;
	}	
}
