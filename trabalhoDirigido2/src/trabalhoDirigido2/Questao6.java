package trabalhoDirigido2;

import java.util.Scanner;
public class Questao6 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int h1, h2, m1, m2, total;
		System.out.println("Digite a hora atual: ");
		do {
			h1 = ler.nextInt();
			m1 = ler.nextInt();
			if((h1<0 || h1>24) && (m1<0 || m1>59)) {
				System.out.println("Entrada invalida! Digite novamente.");
			}
		}while((h1<0 || h1>24) && (m1<0 || m1>59));
		System.out.println("Digite a hora de despertar: ");
		do {
			h2 = ler.nextInt();
			m2 = ler.nextInt();
			if((h2<0 || h2>24) && (m2<0 || m2>59)) {
				System.out.println("Entrada invalida! Digite novamente.");
			}
		}while((h2<0 || h2>24) && (m2<0 || m2>59));
		if(h1>h2) {
			if(m1==m2) {
				total = Math.abs((h1-h2)-24)*60;
			}else if(m1>m2) {
				total = (Math.abs((h1-h2)-24))*60-(m1-m2);
				System.out.println("Voce pode dormir "+total+" minutos");
			}else if(m1<m2) {
				total = (Math.abs((h1-h2)-24))*60+Math.abs((m1-m2));
				System.out.println("Voce pode dormir "+total+" minutos");
			}
		}else if(h2>h1) {
			if(m1==m2) {
				total = (h2-h1)*60;
				System.out.println("Voce pode dormir "+total+" minutos");
			}else if(m1>m2) {
				total = ((h2-h1)*60-(m1-m2));
				System.out.println("Voce pode dormir "+total+" minutos");
			}else if(m1<m2);
			total = ((h2-h1)*60+(m2-m1));
			System.out.println("Voce pode dormir "+total+" minutos");
		}else if(h1==h2) {
			if(m1==m2) {
				System.out.println(" ");
			}else if(m1>m2){
				total = 1440 - (m1-m2);
				System.out.println("Voce pode dormir "+total+" minutos");
			}else if(m1<m2) {
				total = m2-m1;
				System.out.println("Voce pode dormir "+total+" minutos");
			}
		}
		ler.close();
	}
}