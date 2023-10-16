package empresa;
import java.lang.String;
import java.util.GregorianCalendar;
import java.util.Objects;
public class Funcionario {
	private String cpf;
	private String nome;
	private char sexo;
	private float salarioBruto;
	private GregorianCalendar dataNascimento;
	private GregorianCalendar dataAdmissao;

	public Funcionario() {
		this.dataAdmissao = new GregorianCalendar();
	}
	public Funcionario(String cpf, String nome, GregorianCalendar dataAdmissao) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
	}
	public Funcionario(String cpf, String nome, char sexo, float salarioBruto, GregorianCalendar dataNascimento, GregorianCalendar dataAdmissao) {
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salarioBruto = salarioBruto;
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto; 
	}
	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public GregorianCalendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(GregorianCalendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public boolean validarCPF(String cpf) {
		if(cpf.isEmpty() != true || cpf.length() == 14) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validarNascimento(GregorianCalendar dataNascimento){
		if(dataNascimento.get(GregorianCalendar.YEAR)<1920) {
			return false;
		}else {
			return true;
		}

	}
	public boolean validarAdmissao(GregorianCalendar dataAdmissao) {
		if(dataAdmissao.get(GregorianCalendar.YEAR)<1995) {
			return false;
		}else {
			return true;
		}
	}
	public int idade(GregorianCalendar dataNascimento) {
		GregorianCalendar calendario = new GregorianCalendar();
		int anoAtual = calendario.get(GregorianCalendar.YEAR);
		int anoNascimento = dataNascimento.get(GregorianCalendar.YEAR);
		int idade = anoAtual-anoNascimento;
		if(dataNascimento.get(GregorianCalendar.MONTH) > calendario.get(GregorianCalendar.MONTH)) {
			idade--;
		}
		if(dataNascimento.get(GregorianCalendar.MONTH) == calendario.get(GregorianCalendar.MONTH)) {

			if(dataNascimento.get(GregorianCalendar.DAY_OF_MONTH)>calendario.get(GregorianCalendar.DAY_OF_MONTH)) {
				idade --;
			}
		}
		return idade;
	}
	public float salarioLiquido(float salarioBruto) {
		float salarioLiquido;
		if(salarioBruto>3000) { 
			salarioLiquido = (salarioBruto/100) * 73;
		}else {
			salarioLiquido = (salarioBruto/100) * 83;
		}
		return salarioLiquido;
	}
	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", salarioBruto=" + salarioBruto + ", dataNascimento=" + dataNascimento + ", dataAdmissao=" + dataAdmissao + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}

} 