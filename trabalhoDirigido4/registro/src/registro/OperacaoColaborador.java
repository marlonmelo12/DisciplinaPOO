package registro;

import java.util.GregorianCalendar;

public class OperacaoColaborador {
	public static void validarDados(Colaborador[] colaboradores) {
		for(Colaborador funcionario : colaboradores) {
			if(funcionario.validaCPF(funcionario.getCpf()) && funcionario.validaDataAdmissao(funcionario.getDataAdmissao())) {
				System.out.println("Dados válidos do funcionario " + funcionario.getNome());
			}else {
				System.out.println("O funcionario" + funcionario.getNome() + " possui dados inválidos");
			}
		}
	}
	public static void verificarCPF(Colaborador [] colaboradores, String cpf) {
		Colaborador f1 = new Colaborador();
		boolean aux = false;
		if(f1.validaCPF(cpf)) {
			for(Colaborador funcionario : colaboradores) {
				if(funcionario.getCpf() == cpf) {
					System.out.println("O CPF foi encontrado e pertence ao colaborador: "+ funcionario.getNome());
					aux = false;
					break;
				}else {
					aux = true;
				}
			}
			if(aux) {
				System.out.println("Não foi encontrado colaborador com este CPF");
			}
		}else {
			System.out.println("CPF Inválido");
		}
	}
	public static void trabalhaMaisTempo(Colaborador[] colaboradores) {
		Colaborador maisVelho = colaboradores[0];
		for(Colaborador funcionario : colaboradores) {
			if(funcionario.trabalhaMaisTempo(maisVelho)) {
				maisVelho = funcionario;
			}
		}
		System.out.println("O funcionario mais velho é: " + maisVelho.getNome() + " com data de admissao em: " + maisVelho.getDataAdmissao().get(GregorianCalendar.YEAR));
	}
}
