package trabalhoDirigido2;

import java.util.Scanner;
import java.lang.Math;
public class Questao5 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int n, i;
		double somaM = 0, x = 0, somaS = 0, s = 0;
		System.out.println("Digite o tamanho do vetor: ");
		n = ler.nextInt();
		double vetV[] = new double[n];
		double vetS[] = new double[n];
		for(i=0;i<n;i++) {
			System.out.println("Digite o valor do vetor na posicao: "+(i+1));
			vetV[i] = ler.nextInt();
			somaM=vetV[i]+somaM;
		}
		x = somaM/n;
		for(i=0;i<n;i++) {
			vetS[i] = Math.pow(vetV[i]-x, 2);
			somaS = vetS[i]+somaS;
		}
		s = Math.sqrt(somaS/(n-1));
		System.out.println("A media foi: "+x);
		System.out.println("O desvio padrao foi: "+s);
		ler.close();
	}
} 