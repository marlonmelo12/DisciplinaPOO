package registroPessoas;

import java.util.GregorianCalendar;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private GregorianCalendar dataCriacao;
	
	public PessoaJuridica() {
		super("");
		this.cnpj = "";
		this.dataCriacao = new GregorianCalendar();
	}
	
	public PessoaJuridica(String nome) {
		super(nome);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public GregorianCalendar getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(GregorianCalendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	@Override
	public String toString() {
		return super.toString()+", CNPJ" + cnpj + ", Data de Criação: " + dataCriacao.get(GregorianCalendar.DAY_OF_MONTH)+"/"+dataCriacao.get(GregorianCalendar.MONTH)+"/"+dataCriacao.get(GregorianCalendar.YEAR);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		return true;
	}
	
	public boolean validarDocumento(String cnpj) {
		return cnpj != null && cnpj.length() == 18;
	}
	
	public int calcularIdade(GregorianCalendar dataCriacao) {
		GregorianCalendar hoje = new GregorianCalendar();
		
		int anoCriacao = dataCriacao.get(GregorianCalendar.YEAR);
		int mesCriacao = dataCriacao.get(GregorianCalendar.MONTH);
		int diaCriacao = dataCriacao.get(GregorianCalendar.DAY_OF_MONTH);
		
		int anoAtual = hoje.get(GregorianCalendar.YEAR);
		int mesAtual = hoje.get(GregorianCalendar.MONTH);
		int diaAtual = hoje.get(GregorianCalendar.DAY_OF_MONTH);
		
		int idade = anoAtual - anoCriacao;
		if(mesAtual < mesCriacao) {
			idade--;
		}else if(mesAtual == mesCriacao && diaAtual < diaCriacao) {
			idade--;
		}
		return idade;
	}
}