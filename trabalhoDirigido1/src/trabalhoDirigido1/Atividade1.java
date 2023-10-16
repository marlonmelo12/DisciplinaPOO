package trabalhoDirigido1;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, i=0, g, j, cont=0;
		char L;
		System.out.println("Digite a quantidade de sapatos");
		do {
			N = sc.nextInt();
		}while(N%2==1 || N<2 || N>10000);
		int vetTamanho[] = new int[N];
		int vetPe[] = new int[N];
		while(i<N){
			System.out.print("Digite o tamanho e o pé do sapato ");
			System.out.println(i+1);
			vetTamanho[i] = sc.nextInt();
			L = sc.next().charAt(0);
			if(L=='D' || L=='d') {
				vetPe[i]=0;
			}else if(L=='E' || L=='e') {
				vetPe[i]=1;
			}
			if(vetTamanho[i]<30 || vetTamanho[i]>60) {
				System.out.println("Tamanho inválido! Digite novamente.");
			}else {
				i++;
			}
		}
		for(g=0;g<N;g++) {
			for(j=1+g;j<N;j++) {
				if(vetTamanho[g]==vetTamanho[j]) {
					if(vetPe[g]!=vetPe[j]) {
						cont++;
						vetTamanho[g]=0;
						vetTamanho[j]=i*-j;
					}else {
						vetTamanho[g]=0;
					}
				}
			}
		}
		System.out.print("A quantidade de pares é: ");
		System.out.println(cont);
	}
}		