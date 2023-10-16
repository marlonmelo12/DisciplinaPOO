package teste4POO;
import java.util.GregorianCalendar;

public abstract class Pessoa {
	private String nome;
	
	public Pessoa() {
		this.nome = "";
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract boolean validarDocumento(String cpf);
	public abstract int calcularIdade(GregorianCalendar data);
	@Override
	public String toString() {
		return "Nome: "+ nome;
	}
	
	
}
