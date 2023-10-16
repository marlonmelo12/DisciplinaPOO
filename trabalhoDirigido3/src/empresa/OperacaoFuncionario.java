package empresa;

public class OperacaoFuncionario {
	public static void validarFuncionario(Funcionario[] funcionarios) {
		boolean validar = true;
		for(Funcionario funcionario : funcionarios) {
			if(!funcionario.validarCPF(funcionario.getCPF())) {
				validar = false;
			}
			if(!funcionario.validarNascimento(funcionario.getDataNascimento()))
			{
				validar = false;
			}
			if(!funcionario.validarAdmissao(funcionario.getDataAdmissao())) {
				validar = false;
			}
			if(funcionario.getSexo() != 'M' && funcionario.getSexo() != 'F') {
				validar = false;
			}
			if(funcionario.getNome().isEmpty()) {
				validar = false;
			}
			if(funcionario.getSalarioBruto()<=0) {
				validar = false;
			}
			if(validar) {
				System.out.println("Dados Validos para o funcionario: "+funcionario.getNome());
			}else {
				System.out.println("Dados Invalidos para o funcionario: "+funcionario.getNome());
			}
		}
	}
	public static void contarGenero(Funcionario[] funcionarios) {
		int contarM = 0;
		int contarF = 0;
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getSexo() == 'M') {
				contarM++;
			}else {
				contarF++;
			}
		}
		System.out.println("São "+contarM+" funcionarios do sexo masculino e "+contarF+" do sexo feminino.");
	}
	public static void maiorSalario(Funcionario[] funcionarios) {
		Funcionario maior = funcionarios[0];
		Funcionario menor = funcionarios[0];
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.salarioLiquido(funcionario.getSalarioBruto()) > maior.salarioLiquido(maior.getSalarioBruto())) {
				maior = funcionario;
			}
			if(funcionario.salarioLiquido(funcionario.getSalarioBruto()) < menor.salarioLiquido(menor.getSalarioBruto())) {
				menor = funcionario;
			}
		}
		System.out.println("O funcionario com maior salario é "+maior.getNome()+" com salario liquido de "+maior.salarioLiquido(maior.getSalarioBruto()));
		System.out.println("O funcionario com menor salario é "+menor.getNome()+" com salario liquido de "+menor.salarioLiquido(menor.getSalarioBruto()));
	}
	public static void maisVelho(Funcionario[] funcionarios) {
		Funcionario velho = funcionarios[0];
		Funcionario novo = funcionarios[0];
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.idade(funcionario.getDataNascimento())>velho.idade(velho.getDataNascimento())) {
				velho = funcionario;
			}
			if(funcionario.idade(funcionario.getDataNascimento())<novo.idade(novo.getDataNascimento())) {
				novo = funcionario;
			}
		}
		System.out.println("O funcionario mais velho é "+velho.getNome()+" com idade de "+velho.idade(velho.getDataNascimento())+" anos");
		System.out.println("O funcionario mais novo é "+novo.getNome()+" com idade de "+novo.idade(novo.getDataNascimento())+" anos");
	}
}