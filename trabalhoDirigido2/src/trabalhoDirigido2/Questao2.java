package trabalhoDirigido2;

import java.util.Scanner;
public class Questao2 {
	public static void main(String[]args) {
		int n, i, nPares = 0, nImpares = 0, nNeutros = 0, nPositivos = 0, nNegativos = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		n = ler.nextInt();
		int vetA [] = new int[n];
		for(i=0;i<n;i++) {
			System.out.println("Digite o valor do vetor na posição"+(i+1));
			vetA[i] = ler.nextInt();
			if(vetA[i]%2==0){
				nPares++;
			}else {
				nImpares++;
			}if(vetA[i]>0) {
				nPositivos++;
			}if(vetA[i]<0){
				nNegativos++;
			}if(vetA[i]==0) {
				nNeutros++;
			}
		}
		System.out.println("A quantidade de numeros pares foi: "+nPares);
		System.out.println("A quantidade de numeros impares foi: "+nImpares);
		System.out.println("A quantidade de numeros positivos foi: "+nPositivos);
		System.out.println("A quantidade de numeros negativos foi: "+nNegativos);
		System.out.println("A quantidade de numeros neutros foi: "+nNeutros);
		ler.close();
	}
} 