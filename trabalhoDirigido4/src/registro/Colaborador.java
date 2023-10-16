package registro;

import java.lang.String;
import java.util.GregorianCalendar;

public class Colaborador {
	private String cpf;
	private String nome;
	private float salarioBruto;
	private GregorianCalendar dataAdmissao;
	
	public Colaborador() {
		this.cpf = "";
		this.nome = "";
		this.salarioBruto = 0;
		this.dataAdmissao = new GregorianCalendar();
	}
	public Colaborador(String cpf, String nome, float salarioBruto, GregorianCalendar dataAdmissao) {
		this.cpf = cpf;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.dataAdmissao = dataAdmissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public GregorianCalendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(GregorianCalendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public boolean validaCPF(String cpf) {
		return cpf != null && cpf.length() == 14;
	}
	public boolean validaDataAdmissao(GregorianCalendar dataAdmissao) {
		return dataAdmissao.get(GregorianCalendar.YEAR) >= 1990;
	}
	public boolean trabalhaMaisTempo(Colaborador funcionario) {
		 return this.dataAdmissao.before(funcionario.dataAdmissao);
	}
}