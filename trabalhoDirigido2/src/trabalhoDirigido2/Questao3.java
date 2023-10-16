package trabalhoDirigido2;

import java.util.Random;
import java.util.Scanner;
	public class Questao3{
		public static void main(String[]args) {
			Random aleatorio = new Random();
			Scanner ler = new Scanner(System.in);
			int n, i, j, maior;
			System.out.println("Digite o tamanho do vetor: ");
			n = ler.nextInt();
			int vetA[] = new int[n];
			for(i=0;i<n;i++) {
				vetA[i]=aleatorio.nextInt();
			}
			maior = vetA[0];
			for(i=0;i<n;i++) {
				for(j=1;j<n;j++) {
					if(vetA[j]>maior) {
						maior = vetA[j];
					}
				}
			}
			System.out.println(maior);
			ler.close();
		}
}