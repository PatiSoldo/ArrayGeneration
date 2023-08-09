package arraymatriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*Elaborar um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
			Todos os elementos da Diagonal Principal
			Todos os elementos da Diagonal Secundária
			A Soma de todos os elementos da Diagonal Principal
			A Soma de todos os elementos da Diagonal Secundária*/

		
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j= 0; j< 3; j++) {
				System.out.printf("Digite o valor para a posição [%d][%d]: ",i,j );
				matriz[i][j] = leia.nextInt();
			}
		}
        int somaDiagonalPrincipal = 0;
        System.out.println("\nElementos da Diagonal Principal:");
        for(int i=0; i<3; i++) {
        	System.out.println(matriz[i][i] + " ");
        	somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("\nSoma da Diagonal Principal: "+somaDiagonalPrincipal);
        
        int somaDiagonalSecundaria = 0;
        System.out.println("\nElementos da DiagonalSecundária: ");
        for(int i=0; i<3; i++) {
        	System.out.println(matriz[i][2-i]+ " ");
        	somaDiagonalSecundaria += matriz[i][2-i];
        }
        
        System.out.println("\nSoma da Diagonal Secundária: " +somaDiagonalSecundaria);
        
        leia.close();
        
        	
        
	}

}
