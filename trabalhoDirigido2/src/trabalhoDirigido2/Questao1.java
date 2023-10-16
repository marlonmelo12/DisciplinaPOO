package trabalhoDirigido2;

import java.util.Scanner;
	public class Questao1 {
		public static void main(String[]args) {
			float n1, n2, resultado = 0;
			char operador;
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite dois numeros: ");
			n1 = ler.nextFloat();
			n2 = ler.nextFloat();
			System.out.println("Digite o operador: ");
			operador = ler.next().charAt(0);

			switch(operador) {
			case '+':
				resultado = n1+n2;
				System.out.print("O resultado foi: "+resultado);
				break;
			case '-':
				resultado = n1-n2;
				System.out.print("O resultado foi: "+resultado);
				break;
			case '*':
				resultado = n1*n2;
				System.out.print("O resultado foi: "+resultado);
				break;
			case '/':
				if(n2==0) {
					System.out.print("Indeterminação!");
				}else {
					resultado=n1/n2;
					System.out.print("O resultado foi: "+resultado);
				}
				break;
			default:
				System.out.print("Operador Inválido!");
			}
			ler.close();
		}
} 