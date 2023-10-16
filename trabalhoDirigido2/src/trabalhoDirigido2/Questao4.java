package trabalhoDirigido2;

import java.util.Scanner;
public class Questao4 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		String key = "a76dk09";
		String senha = ler.nextLine();
		while(true) {
			if(senha.equals(key)) {
				System.out.print("ACESSO PERMITIDO!");
				break;
			}else {
				System.out.println("SENHA INVALIDA! DIGITE NOVAMENTE");
				senha = ler.nextLine();
			}
		}
		ler.close();
	}
}
