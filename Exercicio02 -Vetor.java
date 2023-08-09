package arrayvetor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Elaborar um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida mostre na tela: 
		 Todos os números ímpares digitados
		 Todos os números pares digitados
		 A soma de todos os números digitados
		 A média de todos os números digitados
		 */
		
		
       Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int[10];
		int numeroDigitado= 0 ;
		int soma=0;
		float media;
		
		for(int i= 0; i<10; i++) {
			System.out.println("\nDigite um número: ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.println("\nNúmeros ímpares:");
		for (int i = 1; i<10; i+=2) {
			System.out.println(numeros[i]+" ");
		}
		System.out.println("\nNúmeros pares:");
		for (int i = 1; i<10; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i]+" ");
			}
		}
		for(int i = 0; i<10; i++) {
			soma+= numeros[i];
		}
		System.out.println("\nSoma dos números é : "+soma);
		
		float media1 = (float) soma/10;
		System.out.println("\nMédia dos números é "+media1);
	}

}

