package arrayvetor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Um vetor contendo 10 números desordenados e não repetidos, contruir um algoritmo que consiga pesquisar
		dados no vetoe, onde o usuário irá digitar um número e o programa vai exibir na tela a opsição deste número
		no vetor. Caso o número não seja encontrado,a mensagem : "Número não encontrado!!" deve ser exibida na tela.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = {5,13,21,18,58,79,43,87,62,3};
		int numeroDigitado= 0 ;
		int posicao= -1;
		
		
		System.out.println("\nDigite um número: ");
		numeroDigitado = leia.nextInt();
		
		for ( int i=0; i<numeros.length; i++) {
			if (numeros[i] == numeroDigitado) {
				posicao= i;
				break;
			}
		}
					 
			if(posicao != -1){
				int posicao1 = posicao+1;
			   System.out.println("\nO número " +numeroDigitado+ " está na posição  "+ posicao1 );
			}else {
				System.out.println("\nNúmero não encontrado!!");
				
			}
		}
	}
	

	