package empresa;

import java.util.Scanner;
import java.lang.String;
import java.util.GregorianCalendar;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos funcionarios irá cadastrar: ");
		int numFuncionarios = scan.nextInt();
		scan.nextLine();
		Funcionario[] funcionarios = new Funcionario[numFuncionarios];
		for(int i=0;i < numFuncionarios; i++) {
			System.out.println("Digite o nome do funcionario "+(i+1));
			String nome = scan.nextLine();
			System.out.println("Digite o CPF do funcionario "+(i+1));
			String cpf = scan.nextLine();
			System.out.println("Digite o sexo do funcionario "+(i+1));
			char sexo = scan.next().charAt(0);
			System.out.println("Digite o salario bruto do funcionario "+(i+1));
			float salarioBruto = scan.nextFloat();
			System.out.println("Digite a data de nascimento do funcionario "+(i+1));
			int anoN, diaN, mesN;
			diaN = scan.nextInt();
			mesN = scan.nextInt();
			anoN = scan.nextInt();
			GregorianCalendar dataNascimento = new GregorianCalendar();
			dataNascimento.set(anoN, mesN, diaN);
			System.out.println("Digite a data de admissao do funcionario "+(i+1));
			int anoA, mesA, diaA;
			diaA = scan.nextInt();
			mesA = scan.nextInt();
			anoA = scan.nextInt();
			scan.nextLine();
			GregorianCalendar dataAdmissao = new GregorianCalendar();
			dataAdmissao.set(anoA, mesA, diaA);
			Funcionario funcionario = new Funcionario(cpf, nome,
					sexo, salarioBruto, dataNascimento, dataAdmissao);
			funcionarios[i] = funcionario;
		}
		OperacaoFuncionario.maiorSalario(funcionarios);
		OperacaoFuncionario.contarGenero(funcionarios);
		OperacaoFuncionario.maisVelho(funcionarios);
		OperacaoFuncionario.validarFuncionario(funcionarios);
		scan.close();
	}
}
