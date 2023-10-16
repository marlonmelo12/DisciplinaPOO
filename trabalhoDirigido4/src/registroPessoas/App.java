package registroPessoas;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int indice, escolha;
		Colecao dados = new ColecaoPessoa();
		while(true) {
			System.out.println("-----------MENU------------");
			System.out.println("1 - Inserir Pessoa");
			System.out.println("2 - Remover");
			System.out.println("3 - Remover (Indice)");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Pesquisar");
			System.out.println("6 - Verificar se a coleção está vázia");
			System.out.println("7 - Imprimir dados da coleção");
			System.out.println("8 - Retornar Objeto");
			System.out.println("9 - Sair");
			System.out.println("\n Digite sua opção:");
			int op = ler.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Digite 1 para pessoa fisica ou 2 para pessoa juridica: ");
				escolha = ler.nextInt();
				if(escolha == 1) {
					PessoaFisica pf = new PessoaFisica();
					System.out.println("Digite o nome: ");
					ler.nextLine();
					String nome = ler.nextLine();
					pf.setNome(nome);
					System.out.println("Digite o CPF: ");
					while(true) {
						String cpf = ler.nextLine();
						if(pf.validarDocumento(cpf)) {
							pf.setCpf(cpf);
							break;
						}else {
							System.out.println("CPF inválido");
						}
						
					}
					System.out.println("Digite a data de nascimento: dd MM yy");
					int ano, dia, mes;
					dia = ler.nextInt();
					mes = ler.nextInt();
					ano = ler.nextInt();
					GregorianCalendar dataNascimento = new GregorianCalendar();
					dataNascimento.set(ano, mes, dia);
					pf.setDataNascimento(dataNascimento);
					
					if(dados.inserir(pf)) {
						System.out.println("Pessoa inserida com sucesso!");
					}else {
						System.out.println("Falha ao inserir pessoa!");
					}
					
				}else if(escolha == 2) {
					PessoaJuridica pj = new PessoaJuridica();
					System.out.println("Digite o nome:");
					ler.nextLine();
					String nome = ler.nextLine();
					pj.setNome(nome);
					System.out.println("Digite o CNPJ:");
					while(true) {
						String cnpj = ler.nextLine();
						if(pj.validarDocumento(cnpj)) {
							pj.setCnpj(cnpj);
							break;
						}else {
							System.out.println("CNPJ inválido!");
						}
					}
					System.out.println("Digite a data de criação: dd/MM/yy");
					int dia, mes, ano;
					dia = ler.nextInt();
					mes = ler.nextInt();
					ano = ler.nextInt();
					GregorianCalendar dataCriacao = new GregorianCalendar();
					dataCriacao.set(ano, mes, dia);
					pj.setDataCriacao(dataCriacao);
					
					if(dados.inserir(pj)) {
						System.out.println("Pessoa inserida com sucesso!");
					}else {
						System.out.println("Falha ao inserir pessoa");
					}
				}
				break;
			case 2:
				if(dados.remover()) {
					System.out.println("Pessoa removida com sucesso!");
				}else {
					System.out.println("Não foi possivel remover");
				}
				break;
			
			case 3:
				System.out.println("Digite o indice:");
				indice = ler.nextInt();
				if(dados.remover(indice)) {
					System.out.println("Pessoa removida com sucesso!");
				}else {
					System.out.println("Não foi possivel remover");
				}
				break;
				
			case 4:
				System.out.println("Digite o indice da pessoa que deseja atualizar: ");
				indice = ler.nextInt();
				System.out.println("Digite 1 para pessoa fisica ou 2 para pessoa juridica: ");
				escolha = ler.nextInt();
				if(escolha == 1) {
					PessoaFisica pf = new PessoaFisica();
					System.out.println("Digite o nome: ");
					ler.nextLine();
					String nome = ler.nextLine();
					pf.setNome(nome);
					System.out.println("Digite o CPF: ");
					while(true) {
						String cpf = ler.nextLine();
						if(pf.validarDocumento(cpf)) {
							pf.setCpf(cpf);
							break;
						}else {
							System.out.println("CPF inválido");
						}
						
					}
					System.out.println("Digite a data de nascimento: dd MM yy");
					int ano, dia, mes;
					dia = ler.nextInt();
					mes = ler.nextInt();
					ano = ler.nextInt();
					GregorianCalendar dataNascimento = new GregorianCalendar();
					dataNascimento.set(ano, mes, dia);
					pf.setDataNascimento(dataNascimento);
					dados.atualizar(indice, pf);
					
				}else if(escolha == 2) {
					PessoaJuridica pj = new PessoaJuridica();
					System.out.println("Digite o nome:");
					ler.nextLine();
					String nome = ler.nextLine();
					pj.setNome(nome);
					System.out.println("Digite o CNPJ:");
					while(true) {
						String cnpj = ler.nextLine();
						if(pj.validarDocumento(cnpj)) {
							pj.setCnpj(cnpj);
							break;
						}else {
							System.out.println("CNPJ inválido!");
						}
					}
					System.out.println("Digite a data de criação: dd/MM/yy");
					int dia, mes, ano;
					dia = ler.nextInt();
					mes = ler.nextInt();
					ano = ler.nextInt();
					GregorianCalendar dataCriacao = new GregorianCalendar();
					dataCriacao.set(ano, mes, dia);
					pj.setDataCriacao(dataCriacao);
					
					dados.atualizar(indice, pj);
				}
				break;
			case 5:
				System.out.println("Digite o tipo de pessoa que quer perquisar:");
				escolha = ler.nextInt();
				if(escolha == 1) {
					PessoaFisica pf = new PessoaFisica();
					System.out.println("Digite o nome: ");
					ler.nextLine();
					String nome = ler.nextLine();
					pf.setNome(nome);
					System.out.println("Digite o CPF: ");
					while(true) {
						String cpf = ler.nextLine();
						if(pf.validarDocumento(cpf)) {
							pf.setCpf(cpf);
							break;
						}else {
							System.out.println("CPF inválido");
						}
						
					}
					System.out.println("Digite a data de nascimento: dd MM yy");
					int ano, dia, mes;
					dia = ler.nextInt();
					mes = ler.nextInt();
					ano = ler.nextInt();
					GregorianCalendar dataNascimento = new GregorianCalendar();
					dataNascimento.set(ano, mes, dia);
					pf.setDataNascimento(dataNascimento);
					if(dados.pesquisar(pf)) {
						System.out.println("Pessoa encontrada!");
					}else {
						System.out.println("Pessoa não encontrada!");
					}
				}else if(escolha == 2) {
					PessoaJuridica pj = new PessoaJuridica();
					System.out.println("Digite o nome:");
					ler.nextLine();
					String nome = ler.nextLine();
					pj.setNome(nome);
					System.out.println("Digite o CNPJ:");
					while(true) {
						String cnpj = ler.nextLine();
						if(pj.validarDocumento(cnpj)) {
							pj.setCnpj(cnpj);
							break;
						}else {
							System.out.println("CNPJ inválido!");
						}
					}
					System.out.println("Digite a data de criação: dd/MM/yy");
					int dia, mes, ano;
					dia = ler.nextInt();
					mes = ler.nextInt();
					ano = ler.nextInt();
					GregorianCalendar dataCriacao = new GregorianCalendar();
					dataCriacao.set(ano, mes, dia);
					pj.setDataCriacao(dataCriacao);
					
					if(dados.pesquisar(pj)) {
						System.out.println("Pessoa Encontrada!");
					}else {
						System.out.println("Pessoa não encontrada.");
					}
				}
				break;
				
			case 6:
				if(dados.colecaoEstaVazia()) {
					System.out.println("Coleção está vazia!");
				}else {
					System.out.println("Coleção não está vazia.");
				}
				break;
			case 7:
				if(!dados.colecaoEstaVazia()) {
					dados.imprimirDadosColecao();
				}else {
					System.out.println("A coleção está vázia");
				}
				break;
			case 8:
				System.out.println("Digite o indice:");
				indice = ler.nextInt();
				Pessoa pessoa = dados.retornarObjeto(indice);
				System.out.println(pessoa.toString());
				break;
			case 9:
				System.exit(0);
				break;
			
			default:
				System.out.println("Entrada inválida!");
			}
		}
	}
}