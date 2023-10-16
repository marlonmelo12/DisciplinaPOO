package registroPessoas;

import java.util.GregorianCalendar;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private GregorianCalendar dataNascimento;
	
	public PessoaFisica() {
		super("");
		this.cpf = "";
		this.dataNascimento = new GregorianCalendar();
	}
	
	public PessoaFisica(String nome) {
		super(nome);	
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento.get(GregorianCalendar.DAY_OF_MONTH)+"/"+dataNascimento.get(GregorianCalendar.MONTH)+"/"+dataNascimento.get(GregorianCalendar.YEAR);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	public boolean validarDocumento(String cpf) {
		return cpf != null && cpf.length() == 14;
	}
	
	public int calcularIdade(GregorianCalendar dataNascimento) {
		GregorianCalendar hoje = new GregorianCalendar();
		int anoNascimento = dataNascimento.get(GregorianCalendar.YEAR);
		int mesNascimento = dataNascimento.get(GregorianCalendar.MONTH);
		int diaNascimento = dataNascimento.get(GregorianCalendar.DAY_OF_MONTH);
		
		int anoAtual = hoje.get(GregorianCalendar.YEAR);
		int mesAtual = hoje.get(GregorianCalendar.MONTH);
		int diaAtual = hoje.get(GregorianCalendar.DAY_OF_MONTH);
		
		int idade = anoAtual - anoNascimento;
		if(mesAtual < mesNascimento) {
			idade--;
		}else if(mesAtual == mesNascimento && diaAtual < diaNascimento) {
			idade--;
		}
		return idade;
	}
}